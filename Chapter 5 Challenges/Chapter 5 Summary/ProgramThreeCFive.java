/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 5 Program Three
*/

import java.util.Scanner;

public class ProgramThreeCFive {
   
   public static void main(String[] args) {
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Declaring variables
      int diceFaces;
      int diceNumber;
      
      // Obtaining diceFaces input
      System.out.print("Enter the number of faces the dice has : ");
      diceFaces = keyboard.nextInt();
      
      // Obtaining diceNumber input (Calling diceRoll method)
      diceNumber = diceRoll(diceFaces);
      
      // Calling diceOutput method
      diceOutput(diceNumber);
      
   } // Main method
   
   // Value-returning method (returns an int)
   private static int diceRoll(int diceFaces) {
      
      // Declaring variable
      int diceNumber;
      
      // Calculation (random dice roll)
      diceNumber = (int)(Math.random() * diceFaces) + 1;
      
      // Returning diceNumber
      return diceNumber;
      
   } // diceRoll method
   
   // void method (returns nothing)
   private static void diceOutput(int diceNumber) {
      
      // Output
      System.out.print("You have rolled a " + diceNumber + "!");
      
   } // diceOutput method
   
} // End class