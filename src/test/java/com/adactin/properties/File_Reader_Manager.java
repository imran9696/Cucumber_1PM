package com.adactin.properties;

import java.io.IOException;

public class File_Reader_Manager {
	
	private File_Reader_Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public static File_Reader_Manager getInstance() {
		
		File_Reader_Manager header = new File_Reader_Manager();
		
		return header;
		
	}
	
	public Configuration_Reader getInstanceCR() throws IOException {
		
		Configuration_Reader reader = new Configuration_Reader();
		
		return reader;
		
	}

}
