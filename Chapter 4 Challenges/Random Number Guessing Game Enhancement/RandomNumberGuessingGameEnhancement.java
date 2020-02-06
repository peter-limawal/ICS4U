/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q18 Random Number Guessing Game Enhancement
*/

import java.util.Scanner;

public class RandomNumberGuessingGameEnhancement {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int number;
      int guess;
      int count = 1;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Creating number
      number = (int)(Math.random() * 100);
      number += 1;
      
      // Obtaining guess input
      System.out.print("Guess the number! (Hint: 1-100) : ");
      guess = keyboard.nextInt();
      
      // While loop
      while (guess != number) {
         
         if (guess < number) {
            
            System.out.print("\nToo low, try again");
            System.out.print("\nEnter number : ");
            guess = keyboard.nextInt();
            
         } else if (guess > number) {
            
            System.out.print("\nToo high, try again");
            System.out.print("\nEnter number : ");
            guess = keyboard.nextInt();
            
         }
         
         count++;
         
      } 
      if (guess == number) {
            
         System.out.printf("\nCongratulations! The number is %d!", number);
         System.out.printf("\nIt took you %d guesses!", count);
            
      }
      
   } // Main method
   
} // End class