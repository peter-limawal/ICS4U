/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 16 Challenges Q8 Sum of Numbers
*/

import java.util.Scanner;

public class SumOfNumbers {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int num;
      int sum;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining num input
      System.out.print("Enter number : ");
      num = keyboard.nextInt();
      
      // Calling add method
      sum = add(num);
      
      // Output
      System.out.printf("The sum of numbers from 1 to %d is %d", num, sum);
      
   } // Main method
   
   private static int add(int num) {
      
      // Base case
      if (num == 1) {
         return 1;
      }
      
      // Recursive case
      else {
         return num + add(num - 1);
      }
      
   } // add method
   
} // End class