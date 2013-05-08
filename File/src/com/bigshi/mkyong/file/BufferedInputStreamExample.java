package com.bigshi.mkyong.file;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author robert1024
 *
 */
public class BufferedInputStreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("C:\\testing.txt");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		
		try{
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis); 
			dis = new DataInputStream(bis);
			while(dis.available()!=0){
				System.out.println(dis.readLine());//use BufferedReader instead.
			}
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				fis.close();
				bis.close();
				dis.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
		
	}

}
