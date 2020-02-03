/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q11 Celcius to Fahrenheit Table
*/

public class CelciusToFahrenheitTable {
   
   public static void main(String[] args) {
   
      // Declaring variables
      double fahrenheit;
   
      // Output
      System.out.println("Celcius     Fahrenheit");
      System.out.print("----------------------");
      
      // For loop
      for (int celcius = 0; celcius <= 20; celcius++) {
         
         fahrenheit = ((9.0 / 5.0) * (double)celcius) + 32;
         
         System.out.printf("\n%d          %.2f", celcius, fahrenheit);
         
      }
      
   }
   
}