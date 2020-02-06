/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q15 Uppercase File Converter
*/

import java.util.Scanner;
import java.io.*;

public class UppercaseFileConverter {
   
   public static void main(String[] args) throws IOException {
      
      // Declaring variables
      String filenameIn;
      String filenameOut;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining filenameIn input
      System.out.print("Enter input file name : ");
      filenameIn = keyboard.nextLine();
      
      // Obtaining filenameOut input
      System.out.print("Enter output file name : ");
      filenameOut = keyboard.nextLine();
      
      // Reading file
      File fileIn = new File(filenameIn);
      Scanner st = new Scanner(fileIn);
      
      // Opening and writing file
      File fileOut = new File(filenameOut);
      PrintWriter out = new PrintWriter(fileOut);
      
      // While loop
      while (st.hasNext()) {
         
         out.println(st.nextLine().toUpperCase());
         
      }
      
      out.close();
      
   } // Main method
   
} // End class