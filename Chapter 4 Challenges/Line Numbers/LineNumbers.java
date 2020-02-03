/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q14 Line Numbers
*/

import java.util.Scanner;
import java.io.*;

public class LineNumbers {
   
   public static void main(String[] args) throws IOException {
      
      // Declaring variables
      String filename;
      int count = 1;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining filename input
      System.out.print("Enter file name : ");
      filename = keyboard.nextLine();
      
      // Reading file
      File file = new File(filename);
      Scanner st = new Scanner(file);
      
      // While loop
      while (st.hasNext()) {
         
         System.out.print("\n" + count + ": " + st.nextLine());
         count++;
         
      }
      
   }
   
}