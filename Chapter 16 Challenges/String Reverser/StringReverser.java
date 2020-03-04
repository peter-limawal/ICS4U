/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 16 Challenges Q3 String Reverser
*/

import java.util.Scanner;

public class StringReverser {
   
   public static void main(String[] args) {
      
      // Declaring variables
      String input;
      String output;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining input input
      System.out.print("Enter string : ");
      input = keyboard.nextLine();
      
      // Calling reverser method
      output = reverser(input);
      
      // Output
      System.out.print(output);
      
   } // Main method
   
   private static String reverser(String input) {
    
    // Base case
    if (input.length() <= 1) {
        return input;
    }
    
    // Recursive case
    else {
      return reverser(input.substring(1)) + input.charAt(0);
    }
    
   } // reverser method
   
} // End class