/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Algorithm Workbench Q1
*/

import java.util.Scanner;

public class AlgorithmWorkbench1 {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int product;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining product input
      System.out.print("Please enter a number : ");
      product = keyboard.nextInt();
      
      // While loop
      while (product < 100) {
         
         product *= 10;
         
      }
      
      System.out.print(product);
      
   }
   
}