package com.tutorialpoints;

import java.io.IOException;
import java.io.StringWriter;

import org.json.simple.JSONObject;

public class JsonEncodeDemo {
	public static void main(String[] args) throws IOException {
		JSONObject obj=new JSONObject();
		obj.put("name","rajesh");
		obj.put("mobileNo",new Integer(996306344));
		obj.put("balance",new Double(1200.0));
		obj.put("address",new String("hyd"));
		System.out.println(obj);
		
		JSONObject emp=new JSONObject();
		emp.put("company","HCL");
		emp.put("place","bangloor");
		StringWriter ot=new StringWriter();
		emp.writeJSONString(ot);
		
		String jsonText=ot.toString();
		System.out.println(jsonText);
	
	}

}
