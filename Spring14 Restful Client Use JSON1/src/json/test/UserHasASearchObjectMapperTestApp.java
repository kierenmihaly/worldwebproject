package json.test;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import spring.domain.Search;
import spring.domain.UserHasASearch;

public class UserHasASearchObjectMapperTestApp {
	
	//main method
	public static void main(String[] args)throws Exception {
		
		UserHasASearch userHasASearch = new UserHasASearch("user01", "홍길동", "1111", null, 10);
		Search search = new Search();
		search.setSearchCondition("이름검색");
		userHasASearch.setSearch(search);
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		System.out.println("\n\n//////////////");
		System.out.println("1.domain object -->JSON(String)로 변환");
		String jsonValue = objectMapper.writeValueAsString(userHasASearch);
		System.out.println(jsonValue);
		
		System.out.println();
		
		System.out.println("1.Json Value ==>Domain Object변환 값 추출");
		UserHasASearch returnUserHasASearch = objectMapper.readValue(jsonValue,
				UserHasASearch.class);
		System.out.println(returnUserHasASearch);
		System.out.println("userId"+returnUserHasASearch.getUserId());
		System.out.println("searchCOndition"+
		returnUserHasASearch.getSearch().getSearchCondition());
		
		System.out.println();
		
		System.out.println("1.JSON Value => JSONObject 사용 값추출");
		JSONObject jsonObj = (JSONObject)JSONValue.parse(jsonValue);
		System.out.println(jsonObj);
		System.out.println("userId:"+jsonObj.get("userId"));
		System.out.println("searchCondition"+((JSONObject)(jsonObj.get("search")))
				.get("searchCondition"));
	}
}
