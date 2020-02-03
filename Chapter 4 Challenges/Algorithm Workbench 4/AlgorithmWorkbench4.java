/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Algorithm Workbench Q4
*/

import java.util.Scanner;

public class AlgorithmWorkbench4 {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int number;
      int sum = 0;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // For loop
      for (int i = 0; i < 10; i++) {
         
         System.out.print("Enter number : ");
         number = keyboard.nextInt();
         
         sum += number;
         
         System.out.println("Current sum : " + sum);
         
      }
      
   }
   
}