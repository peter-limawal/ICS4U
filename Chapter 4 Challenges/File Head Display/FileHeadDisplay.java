/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q13 File Head Display
*/

import java.util.Scanner;
import java.io.*;

public class FileHeadDisplay {
   
   public static void main(String[] args) throws IOException {
      
      // Declaring variables
      String filename;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining filename input
      System.out.print("Enter file name : ");
      filename = keyboard.nextLine();
      
      // Reading file
      File file = new File(filename);
      Scanner st = new Scanner(file);
      
      // For loop
      outerloop:
      for (int i = 1; i <= 5; i++) {
         if (st.hasNext()) {
            
            System.out.print("\n" + st.nextLine());
            
         } else {
            break outerloop;
         }
      }
      
   }
   
}