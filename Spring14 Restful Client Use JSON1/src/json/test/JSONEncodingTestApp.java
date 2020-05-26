package json.test;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONEncodingTestApp {
	//main method
	public static void main(String[] args) {
		
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("name", "ȫ�浿");
		jsonObj.put("age", new Integer(1000));
		jsonObj.put("adress", "����");
		
		System.out.println("JSON Object Ȯ��:" +jsonObj);
		
		System.out.println("JSON Object ȣ��:");
		System.out.println(jsonObj.get("adress"));
		System.out.println("\n\n");
	
	/////////////////////////////////////////
		
		JSONObject innerJsonObj = new JSONObject();
		innerJsonObj.put("name", "innerȫ�浿");
		innerJsonObj.put("age", new Integer(1000));
		innerJsonObj.put("adress", "inner����");
		jsonObj.put("innerJson", innerJsonObj);
		
		System.out.println("JSON Object Ȯ��:" +jsonObj);
		
		System.out.println(jsonObj.get("adress"));
		JSONObject returnJsonObj = (JSONObject)jsonObj.get("innerJson");
		System.out.println(returnJsonObj.get("adress"));
		System.out.println("\n\n");
	
	////////////////////////////////////////////
	Map<String,String> map = new HashMap<String, String>();
	map.put("����1","���");
	map.put("����2","�븮");
	map.put("����3","����");
	jsonObj.put("career", map);
	
	System.out.println("JSON Object Ȯ��" +jsonObj);
	
	System.out.println("json O D ����");
	System.out.println(jsonObj.get("career"));
	Map returnMap = (Map)jsonObj.get("career");
	System.out.println(returnMap.get("����1"));
	System.out.println("\n\n");
	
	///////////////////////////////////
	
	JSONArray jsonArray = new JSONArray();
	jsonArray.add(new Integer(1));
	jsonArray.add("2");
	jsonArray.add("3");
	jsonObj.put("number", jsonArray);
	
	System.out.println("JSON Object Ȯ��:" +jsonObj);
	
	System.out.println("json O D ����");
	System.out.println(jsonObj.get("number"));
	JSONArray returnJsonArray=(JSONArray)jsonObj.get("number");
	System.out.println(returnJsonArray.get(0));

	
	
	}
}//class
