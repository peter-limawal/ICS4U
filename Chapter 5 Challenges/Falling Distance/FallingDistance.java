/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 5 Challenges Q5 Falling Distance
*/

public class FallingDistance {
   
   public static void main(String[] args) {
      
      // Declaring variables
      double distance;
      double time;
      
      // Output
      System.out.print("\tTime (s)\t\tDistance (m)");
      System.out.print("\n------------------------------");
      
      // For loop
      for (int i = 1; i <= 10; i++) {
         
         System.out.printf("\n\t\t%d\t\t\t\t%.2f", i, fallingDistance(i));
         
      }
      
   } // Main method
   
   private static double fallingDistance(double time) {
      
      // Declaring variable
      double distance;
      
      // Calculation
      distance = (0.5 * 9.8 * time * time);
      
      // Returning distance
      return distance;
      
   } // fallingDistance method
   
} // End class