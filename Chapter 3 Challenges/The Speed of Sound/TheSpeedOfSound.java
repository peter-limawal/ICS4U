/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 3 Challenges Q12 The Speed of Sound
*/

import java.util.Scanner; // Import Scanner class

public class TheSpeedOfSound {

   public static void main(String[] args) {

      // Declaring variables
      String medium;
      double speed = 0;
      double distance;
      double time;

      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);

      // Obtaining medium input
      System.out.print("What medium will the sound wave travel in? (air/water/steel) : ");
      medium = keyboard.nextLine();
      medium = medium.toLowerCase();

      // Obtaining distance input
      System.out.print("What is the distance that the sound wave will travel in the medium? (in feet) : ");
      distance = keyboard.nextDouble();

      // Switch statement to determine speed
      switch (medium) {
         case "air":
            speed = 1100;
            break;
         case "water":
            speed = 4900;
            break;
         case "steel":
            speed = 16400;
            break;
         // Output statement if input is not within parameters
         default:
            System.out.print("\nERROR! Please enter a proper medium! (air/water/steel)");
            break;
      }

      // If statement if distance does not match parameters
      if (distance < 0) {
         System.out.print("\nERROR! Distance travelled cannot be less than 0!");
      }

      // If statement if medium matches parameters
      if ((medium.equals("air") || medium.equals("water") || medium.equals("steel")) && (distance >= 0)) {

         // Calculation
         time = distance / speed;

         // Output
         System.out.printf("\nIt will take approximately %.2f seconds for the sound wave to travel", time);

      }

   } // Main method

} // End class
