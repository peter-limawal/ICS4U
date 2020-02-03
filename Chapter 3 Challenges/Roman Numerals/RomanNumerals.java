/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 3 Challenges Q1 Roman Numerals
*/

import java.util.Scanner; // Import Scanner class

public class RomanNumerals {

   public static void main(String[] args) {

      // Declaring variables
      int number;

      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);

      // Obtaining number input
      System.out.print("Please enter an integer between 1 - 10 to convert into roman numerals : ");
      number = keyboard.nextInt();

      // Switch statement with outputs for numbers 1-10
      switch (number) {
         case 1:
            System.out.print("The number " + number + " is " + "I" + " in roman numerals.");
            break;
         case 2:
            System.out.print("The number " + number + " is " + "II" + " in roman numerals.");
            break;
         case 3:
            System.out.print("The number " + number + " is " + "III" + " in roman numerals.");
            break;
         case 4:
            System.out.print("The number " + number + " is " + "IV" + " in roman numerals.");
            break;
         case 5:
            System.out.print("The number " + number + " is " + "V" + " in roman numerals.");
            break;
         case 6:
            System.out.print("The number " + number + " is " + "VI" + " in roman numerals.");
            break;
         case 7:
            System.out.print("The number " + number + " is " + "VII" + " in roman numerals.");
            break;
         case 8:
            System.out.print("The number " + number + " is " + "VIII" + " in roman numerals.");
            break;
         case 9:
            System.out.print("The number " + number + " is " + "IX" + " in roman numerals.");
            break;
         case 10:
            System.out.print("The number " + number + " is " + "X" + " in roman numerals.");;
            break;
         // Output statement if input is not within parameters
         default:
            System.out.print("ERROR! Please enter an integer between 1 - 10");
            break;
      }

   } // Main method

} // End class
