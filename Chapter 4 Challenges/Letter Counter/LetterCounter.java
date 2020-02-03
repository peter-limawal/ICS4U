/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q5 Letter Counter
*/

import java.util.Scanner;

public class LetterCounter {
   
   public static void main(String[] args) {
      
      // Declaring variables
      String words;
      char character;
      int count = 0;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining words input
      System.out.print("Please enter words : ");
      words = keyboard.nextLine();
      
      // Obtaining character input
      System.out.print("Please enter character : ");
      character = keyboard.next().charAt(0);
      
      // For loop
      for (int i = 0; i < words.length(); i++) {
         
         // If statement
         if (words.charAt(i) == character) {
            
            count++;
            
         }
         
      }
      
      // Output
      System.out.print("\nCount : " + count);
      
   }
   
}