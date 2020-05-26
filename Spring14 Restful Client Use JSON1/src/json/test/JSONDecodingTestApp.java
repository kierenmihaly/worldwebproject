package json.test;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JSONDecodingTestApp {
	public static void main(String[] args) {
		
		String data = "{\"address\":\"서울\",\"age\":1000,\"name\":\"홍길동\"}";
		JSONObject jsonObj = (JSONObject)JSONValue.parse(data);
		
		System.out.println("json object 확인" +jsonObj);
		
		System.out.println("J O D 추출");
		System.out.println(jsonObj.get("address"));
		System.out.println("\n\n");
		
		String arrayData = "[\"서울\",1000,\"홍길동\"]";
		JSONArray jsonArray = (JSONArray)JSONValue.parse(arrayData);
		
		System.out.println("JSON O 확인"+jsonObj);
		
		System.out.println("JSON O D 추출");
		System.out.println(jsonArray.get(0));
	}
}
