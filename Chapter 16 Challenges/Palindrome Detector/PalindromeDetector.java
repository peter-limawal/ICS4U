/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 16 Challenges Q5 Palindrome Detector
*/

import java.util.Scanner;

public class PalindromeDetector {
   
   public static void main(String[] args) {
      
      // Declaring variables
      String original;
      String text = "";
      boolean verdict;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining original input
      System.out.print("Enter palindrome string : ");
      original = keyboard.nextLine();
      original = original.toLowerCase();
      
      // Creating text string
      for (int i = 0; i < original.length(); i++) {
         
         if (original.charAt(i) >= 'a' && original.charAt(i) <= 'z') {
            text += original.charAt(i);
         }
         
      }
      
      // Calling detector method
      verdict = detector(text);
      
      // Output
      if (verdict == true) {
         System.out.print("Is palindrome!");
      } else if (verdict == false) {
         System.out.print("Is not palindrome!");
      }
      
   } // Main method
   
   private static boolean detector(String input) {
      
      // Base case
      if (input.length() == 0 || input.length() == 1) {
         return true;
      } else if (input.charAt(0) != input.charAt(input.length()-1)) {
         return false;
      }
      
      // Recursive case
      else {
         return detector(input.substring(1, input.length()-1));
      }
      
   } // detector method
   
} // End class