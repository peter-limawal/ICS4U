/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 16 Challenges Q7 Recursive Power Method
*/

import java.util.Scanner;

public class RecursivePowerMethod {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int number;
      int exponent;
      int answer;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining number input
      System.out.print("Enter number : ");
      number = keyboard.nextInt();
      
      // Obtaining exponent input
      System.out.print("Enter exponent : ");
      exponent = keyboard.nextInt();
      
      // Calling power method
      answer = power(number, exponent);
      
      // Output
      System.out.print(number + " ^ " + exponent + " = " + answer);
      
   } // Main method
   
   private static int power(int num, int exp) {
   
      // Base case
      if (exp == 0) {
         return 1;
      }
   
      // Recursive case
      else {
         return num * power(num, exp - 1);
      }
      
   } // power method
   
} // End class