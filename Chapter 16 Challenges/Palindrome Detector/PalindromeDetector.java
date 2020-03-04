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
      
      // Calling remover method
      text = remover(original);
      
      // Calling detector method
      verdict = detector(text);
      
      // Output
      if (verdict == true) {
         System.out.print("Is palindrome!");
      } else if (verdict == false) {
         System.out.print("Is not palindrome!");
      }
      
   } // Main method
   
   private static String remover(String original) {
      
      // Base case
      if (original.length() == 0) {
         return original;
      }
      
      // Recursive case
      if (original.charAt(0) >= 'a' && original.charAt(0) <= 'z') {
         return original.charAt(0) + remover(original.substring(1));
      } else {
         return remover(original.substring(1));
      }
      
   } // remover method
   
   private static boolean detector(String input) {
      
      // Base case
      if (input.length() <= 1) {
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