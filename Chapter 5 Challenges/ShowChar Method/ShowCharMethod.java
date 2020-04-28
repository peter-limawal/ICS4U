/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 5 Challenges Q1 ShowChar Method
*/

import java.util.Scanner;

public class ShowCharMethod {
   
   public static void main(String[] args) {
      
      // Declaring variables
      String object;
      int index;
      char letter;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining object input
      System.out.print("Enter string : ");
      object = keyboard.nextLine();
      
      // Obtaining index input
      System.out.print("Enter index number : ");
      index = keyboard.nextInt();
      
      // Calling showChar method
      letter = showChar(object, index);
      
      // Output
      System.out.print("\nThe character is " + letter);
      
   } // Main method
   
   private static char showChar(String object, int num) {
   
      // Returning char at index num   
      return object.charAt(num);
      
   } // showChar method
   
} // End class