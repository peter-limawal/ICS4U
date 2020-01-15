/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 2 Challenges Q8 Cookie Calories
*/

import java.util.Scanner; // Import Scanner class

public class CookieCalories {

   public static void main(String[] args) {

      // Declaring variables
      int numInBag = 40;
      int numServingsInBag = 10;
      int numPerServing = numInBag / numServingsInBag;
      int caloriesPerServing = 300;
      int caloriesPerCookie = caloriesPerServing / numPerServing;
      int cookiesEaten;

      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);

      // Obtaining cookiesEaten
      System.out.print("How many cookies have you eaten? : ");
      cookiesEaten = keyboard.nextInt();

      // Calculations
      int caloriesConsumed = cookiesEaten * caloriesPerCookie;

      // Output
      System.out.print("\nYou ate " + cookiesEaten + " cookies");
      System.out.print("\nYou have consumed " + caloriesConsumed + " calories");

   } // Main method

} // End class
