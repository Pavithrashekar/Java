package com.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileQ2 {
    public static void main(String[] args) throws IOException {
        String msg1 = "Welcome to CDAC Bangalore.";
        String msg2 = "CDAC ACTS.";
        String msg3 = "Java File Handling Assignment.";
        String msg4 = "There are multiple modules in DAC like JAVA, C++, MySQL, Data Structures, Web Development, etc.";
        String msg5 = "There will be module end exam for all the modules.";
        FileWriter fw = new FileWriter("Assignment.txt");
        fw.write(msg1 + "\n");
        fw.write(msg2 + "\n");
        fw.write(msg3 + "\n");
        fw.write(msg4 + "\n");
        fw.write(msg5 + "\n");
        fw.close();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word you want to search: ");
        String check = sc.next();

        FileReader fr = new FileReader("Assignment.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        boolean found = false;
        int lineNumber = 0;
        while ((line = br.readLine()) != null) {
            lineNumber++;
          
            if (line.contains(check)) {
                System.out.println("Word '" + check + "' found in line " + lineNumber + " of file Assignment.txt");
                found = true;
            }
            //System.out.println(line);
        }
        
        if (!found) {
            System.out.println("Word '" + check + "' not found in the file.");
        }
        br.close();
    }
}
