/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 16 Challenges Q1 Recursive Multiplication
*/

import java.util.Scanner;

public class RecursiveMultiplication {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int x;
      int y;
      int answer;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining x input
      System.out.print("Enter integer x : ");
      x = keyboard.nextInt();
      
      // Obtaining y input
      System.out.print("Enter integer y : ");
      y = keyboard.nextInt();
      
      // Calling multiply method
      answer = multiply(x, y);
      
      // Output
      System.out.printf("\n%d * %d = %d", x, y, answer);
      
   } //Main method
   
   private static int multiply(int x, int y) {
      
      // Base case
      if (y == 0) {
         return 0;
      } 
      
      // Recursive case
      else {
         return x + multiply(x, y - 1);
      }
      
   } // multiply method
   
} // End class