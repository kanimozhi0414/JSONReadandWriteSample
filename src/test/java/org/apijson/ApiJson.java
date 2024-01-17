package org.apijson;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ApiJson
{
	public static void main(String[] args) throws IOException, ParseException 
	{
		FileReader fileReader = new FileReader("C:\\Users\\Kanimozhi Maniselvam\\eclipse-workspace\\MavenProjectSample\\src\\test\\resources\\JSON\\sampleDatatype.json");
		JSONParser parser = new JSONParser();
		Object object = parser.parse(fileReader);
		System.out.println(object);
		System.out.println("Details Clearly");
		
		System.out.println("Company Details : ");
		JSONObject jsonObject = (JSONObject) object;
		Object companyDetails = jsonObject.get("companyDetails");
		JSONObject jsonObject1 = (JSONObject) companyDetails;
		System.out.println(jsonObject1.get("companyName"));
		System.out.println(jsonObject1.get("companyaddress"));
		System.out.println(jsonObject1.get("companyType"));
		System.out.println(jsonObject1.get("companyPhoneNo"));
		System.out.println(jsonObject1.get("companyStatus"));
		
		System.out.println("Employee Details : ");
		Object employeeDetails = jsonObject.get("employeeDetails");
		JSONObject jsonObject2 = (JSONObject) employeeDetails;
		System.out.println(jsonObject2.get("firstName"));
		System.out.println(jsonObject2.get("middleName"));
		System.out.println(jsonObject2.get("lastName"));
		System.out.println(jsonObject2.get("phone"));
		
		System.out.println("Employee Role : ");
		Object array = jsonObject.get("employeeRole");
		JSONArray jsonArray = (JSONArray) array;
		for(int i=0; i<jsonArray.size(); i++)
		{
			System.out.println(jsonArray.get(i));
		}
		
		System.out.println(jsonObject.get("employeeAddress"));
		System.out.println(jsonObject.get("employeeGmailId"));
		System.out.println(jsonObject.get("marriageStatus"));
		System.out.println(jsonObject.get("workingStatus"));
		System.out.println(jsonObject.get("employeeTimimng"));	

		System.out.println("Supervisor Details : ");
		Object supervisorDetails = jsonObject.get("supervisorDetails");
		JSONObject jsonObject3 = (JSONObject) supervisorDetails;
		System.out.println(jsonObject3.get("firstName"));
		System.out.println(jsonObject3.get("middleName"));
		System.out.println(jsonObject3.get("lastName"));
		System.out.println(jsonObject3.get("phone"));

		System.out.println("Supervisor Role : ");
		Object array1 = jsonObject.get("supervisorRole");
		JSONArray jsonArray1 = (JSONArray) array1;
		for(int i=0; i<jsonArray1.size(); i++)
		{
			System.out.println(jsonArray1.get(i));
		}
		
		System.out.println(jsonObject.get("supervisorAddress"));
		System.out.println(jsonObject.get("supervisorGmailId"));
		System.out.println(jsonObject.get("supervisorWorkingStatus"));
		System.out.println(jsonObject.get("supervisorTiming"));
	}
}
