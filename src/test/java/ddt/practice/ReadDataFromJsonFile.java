package ddt.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;

public class ReadDataFromJsonFile {

	

	public static void main(String[] args) throws Throwable {
		//step:1 convert JSON File into JSON object
		FileReader fr=new FileReader("./commondata.json");
		
		 //step:2 Convert JSON Object into Java Object
		JSONParser jp=new JSONParser();
		Object jobj = jp.parse(fr);
		  
		//step:3 Use HashMap to read data
		HashMap hp= (HashMap)jobj;
		String value=(String)hp.get("url");
		System.out.println(value);
		
		
		// TODO Auto-generated method stub

	}

}
