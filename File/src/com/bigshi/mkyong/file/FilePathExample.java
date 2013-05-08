package com.bigshi.mkyong.file;

import java.io.File;
import java.io.IOException;

/**
 * @author robert1024
 *
 */
public class FilePathExample {
	
	public static void main(String[] args) {
		try{
			String filename = "testing.txt";
			String finalfile = "";
			String workingDir = System.getProperty("user.dir");
			
			finalfile = workingDir + File.separator + filename;
			
			System.out.println("Final filepath: "+finalfile);
			
			File file = new File(finalfile);
			
			if(file.createNewFile()){
				System.out.println("Done");
			}else{
				System.out.println("File already exists!");
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
