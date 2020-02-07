/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q20 Square Display
*/

import java.util.Scanner;

public class SquareDisplay {

   public static void main(String[] args) {

      // Declaring variables
      int num;
      String output = "";

      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);

      // Obtaining num input
      System.out.print("Enter number between and including 1 - 15 : ");
      num = keyboard.nextInt();

      if (num > 0 && num <= 15) {

         for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
               output += "X";
            }
            output += "\n";
         }

         System.out.print(output);

      } else {
         System.out.print("\nERROR! Number is not between and including 1 - 15!");
      }

   } // Main method

} // End class
