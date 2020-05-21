/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 5 Program Two
*/

import java.util.Scanner;

public class ProgramTwoCSixteen {
   
   public static void main(String[] args) {
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Declaring variable
      String sentence;
      String finalSentence;
      
      // Obtaining sentence input
      System.out.print("Enter a sentence : ");
      sentence = keyboard.nextLine();
      
      // Obtaining finalSentence
      // Calling vowelCapitalise method
      finalSentence = vowelCapitalise(sentence);
      
      System.out.print("\n" + finalSentence);
      
   } // Main method
   
   private static String vowelCapitalise(String sentence) {
      
      // Base case
      // Without this the program would crash because the length of a string cannot be negative!
      if (sentence.length() == 0) {
         return sentence;
      }
      
      // Recursive call
      else {
         
         switch (sentence.charAt(0)) {
            case 'a':
               return "A" + vowelCapitalise(sentence.substring(1));
            case 'e':
               return "E" + vowelCapitalise(sentence.substring(1));
            case 'i':
               return "I" + vowelCapitalise(sentence.substring(1));
            case 'o':
               return "O" + vowelCapitalise(sentence.substring(1));
            case 'u':
               return "U" + vowelCapitalise(sentence.substring(1));
            default:
               return sentence.charAt(0) + vowelCapitalise(sentence.substring(1));
         }
         
      }
      
   } // vowelCapitalise
   
} // End class