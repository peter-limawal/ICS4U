/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 5 Challenges Q6 Celsius Temperature Table
*/

public class CelsiusTemperatureTable {
   
   public static void main(String[] args) {
      
      // Declaring variables
      double celsius;
      System.out.println("Fahrenheit         Celsius");
      System.out.println("--------------------------");
      
      // For loop
      for (double fahrenheit = 0; fahrenheit <= 20; fahrenheit++) {
         
         celsius = Celsius(fahrenheit);
         System.out.printf("%.2f             %.2f\n", fahrenheit, celsius);
         
      }
      
   } // Main method
   
   private static double Celsius(double fahrenheit) {
      
       // Declaring variable
       double celsius;
       
       // Calculation
       celsius = (5.0 / 9.0) * (fahrenheit - 32.0);
       
       // Returning celsius
       return celsius;
      
   } // Celsius method
   
} // End class