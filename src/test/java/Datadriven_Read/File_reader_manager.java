package Datadriven_Read;

import com.properties.Configuration_Reader;

public class File_reader_manager {
	
	private File_reader_manager() {
		
		//constructor
	}
	
	public static File_reader_manager getInstanceFRM() {
		
		File_reader_manager frm = new File_reader_manager();
		return frm;
		
		

	}
	
	
	public Configuration_Reader getInstanceCR() throws Throwable {
		
		Configuration_Reader cr = new Configuration_Reader();
		return cr;

	}
	
	
	
	
	
	
	

}
