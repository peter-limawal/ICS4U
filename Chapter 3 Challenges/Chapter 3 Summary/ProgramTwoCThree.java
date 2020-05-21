/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 3 Program Two
*/

import java.util.Scanner;

public class ProgramTwoCThree {
   
   public static void main(String[] args) {
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Declaring variables
      String fruitA;
      String fruitB;
      String fruitC;
      
      // Obtaining fruit inputs
      System.out.print("Enter fruit A : ");
      fruitA = keyboard.nextLine();
      System.out.print("Enter fruit B : ");
      fruitB = keyboard.nextLine();
      System.out.print("Enter fruit C : ");
      fruitC = keyboard.nextLine();
      
      // If statement
      if (fruitA.equals(fruitB) && fruitB.equals(fruitC)) {
         System.out.print("Fruit A, B, and C are the same! (" + fruitA + ")");
      }
      
      // Else statement
      else {
         System.out.print("Fruit A, B, and C are not all the same! (" + fruitA + ", " + fruitB + ", " + fruitC + ")");
      }
      
   } // Main method
   
} // End class