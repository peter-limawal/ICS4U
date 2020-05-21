/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 3 Program Three
*/

import java.util.Scanner;

public class ProgramThreeCThree {
   
   public static void main(String[] args) {
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Declaring variables
      int birthMonth;
      
      // Obtaining birthMonth input
      System.out.print("Enter your birth month in numbers (1 = January, 2 = Febuary, etc.) : ");
      birthMonth = keyboard.nextInt();
      
      // Switch statement
      switch (birthMonth) {
         case 1:
            System.out.print("Your birth stone is a garnet!");
            break;
         case 2:
            System.out.print("Your birth stone is an amethyst");
            break;
         case 3:
            System.out.print("Your birth stone is an aquamarine");
            break;
         case 4:
            System.out.print("Your birth stone is a diamond");
            break;
         case 5:
            System.out.print("Your birth stone is an emerald");
            break;
         case 6:
            System.out.print("Your birth stone is a pearl");
            break;
         case 7:
            System.out.print("Your birth stone is a ruby");
            break;
         case 8:
            System.out.print("Your birth stone is a peridot");
            break;
         case 9:
            System.out.print("Your birth stone is a sapphire");
            break;
         case 10:
            System.out.print("Your birth stone is an opal");
            break;
         case 11:
            System.out.print("Your birth stone is a topaz");
            break;
         case 12:
            System.out.print("Your birth stone is a turquoise");
            break;
         default:
            System.out.print("Error! Month does not exist!");
            break;
      }
      
   } // Main method
   
} // End class