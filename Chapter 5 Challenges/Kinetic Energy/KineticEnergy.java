/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 5 Challenges Q12 Kinetic Energy
*/

import java.util.Scanner;

public class KineticEnergy {
   
   public static void main(String[] args) {
      
      // Declaring variables
      double mass, velocity, KE;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining mass input
      System.out.print("Enter mass in kg : ");
      mass = keyboard.nextDouble();
      
      // Obtaining velocity input
      System.out.print("Enter velocity in m/s : ");
      velocity = keyboard.nextDouble();
      
      // Obtaining KE
      KE = kineticEnergy(mass, velocity);
      
      // Output
      System.out.printf("\nThe kinetic energy is %.2f J", KE);
      
   } // Main method
   
   private static double kineticEnergy(double mass, double velocity) {
      
      return 0.5 * mass * velocity * velocity;
      
   } // kineticEnergy method
   
} // End class