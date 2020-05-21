/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 3 Program One
*/

import java.util.Scanner;

public class ProgramOneCThree {
   
   public static void main(String[] args) {
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Declaring variables
      int num;
      
      // Obtaining num input
      System.out.print("Enter a number: ");
      num = keyboard.nextInt();
      
      // If-else-if statements
      if (num < 0) {
         System.out.print("The number " + num + " is less than 0");
      } else if (num > 100) {
         System.out.print("The number " + num + " is more than 100");
      } else {
         System.out.print("The number " + num + " is between and inclusive of 0 and 100");
      }
      
   } // Main method
   
} // End class