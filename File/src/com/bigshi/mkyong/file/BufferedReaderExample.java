package com.bigshi.mkyong.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author robert1024
 *
 */
public class BufferedReaderExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BufferedReader br = null;
		try{
			String line;
			
			br = new BufferedReader(new FileReader("C:\\testing.txt"));
			
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				if(br!=null)br.close();
			}catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

}
