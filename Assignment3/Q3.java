package com.file;

import java.io.*;

public class Q3 {
    public static void main(String[] args) {
    	 if (args.length < 2) {
             System.out.println("Usage: java FileHandling <source_file> <destination_file>");
             return;
         }
         
         String sourceFile = args[0];
         String destinationFile = args[1];
         
         copyFile(sourceFile, destinationFile);


    }
	 public static void copyFile(String sourceFileName, String destinationFileName) {
	        try {
	            FileInputStream fis = new FileInputStream(sourceFileName);
	            FileOutputStream fos = new FileOutputStream(destinationFileName);
	            byte[] buffer = new byte[4096];
	            int bytesRead;

	            while ((bytesRead = fis.read(buffer)) != -1) {
	                fos.write(buffer, 0, bytesRead);
	            }

	            fis.close();
	            fos.close();

	            System.out.println("File copied successfully.");
	        } catch (IOException e) {
	            System.err.println("Error copying the file: " + e.getMessage());
	        }
	    }

}
