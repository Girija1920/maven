package rest_api;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Json_parser_ex {
	
	public static void main(String[] args) throws Throwable {
		
		File f = new File("C:\\Users\\vgirija\\eclipse-workspace\\Maven_project\\src\\test\\java\\rest_api\\payload.json");
		
		FileReader fr= new FileReader(f);
		
		JSONParser json = new JSONParser();
		
		Object parse = json.parse(fr);
		
		JSONObject obj = (JSONObject) parse;
		
		Object value = obj.get("page");
		
		System.out.println(value);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
