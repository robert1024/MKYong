package com.bigshi.mkyong.file;

import java.io.File;
import java.io.IOException;

/**
 * @author robert1024
 * In Java 7, use PosixFilePermission
 * 	Set<PosixFilePermission> perms = new HashSet<>(PosixFilePermission);
 * 	perms.add(PosixFilePermission.##);
 * 	Files.setPosixFilePermissions(Paths.get(""),perms);
 */
public class FilePermissionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try{
			File file = new File("C:\\newfile.txt");
			if(file.exists()){
				System.out.println("Is Execute allow: "+file.canExecute());
				System.out.println("Is Write allow: "+file.canWrite());
				System.out.println("Is Read allow: "+file.canRead());
			}
			file.setExecutable(false);
			file.setReadable(false);
			file.setWritable(false);
			
			
			System.out.println("Is Execute allow: "+file.canExecute());
			System.out.println("Is Write allow: "+file.canWrite());
			System.out.println("Is Read allow: "+file.canRead());
			
			if(file.createNewFile()){
				System.out.println("File is created!");
			}else{
				System.out.println("File exists!");
			}
		}catch (IOException e){
			e.printStackTrace();
		}
		
	}

}
