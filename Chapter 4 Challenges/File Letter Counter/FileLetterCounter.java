/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q6 File Letter Counter
*/

import java.util.Scanner;
import java.io.*;

public class FileLetterCounter {
   
   public static void main(String[] args) throws IOException {
   
      // Declaring variables
      String fileName;
      char character;
      int count = 0;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining words input
      System.out.print("Please enter file name : ");
      fileName = keyboard.nextLine();
      
      // Obtaining character input
      System.out.print("Please enter character : ");
      character = keyboard.next().charAt(0);
   
      // Reading file
      File file = new File(fileName);
      Scanner st = new Scanner(file);
      
      // Do-While loop
      do {
      
         // Obtaining input
         String input = st.nextLine();
         
         // For loop
         for (int i = 0; i < input.length(); i++) {
         
         // If statement
            if (input.charAt(i) == character) {
            
               count++;
            
            }
         
         }
         
      } while (st.hasNext());
      
      // Output
      System.out.print("\nCount : " + count);
      
   }
   
}