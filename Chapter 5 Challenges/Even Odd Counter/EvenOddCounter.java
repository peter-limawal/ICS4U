/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 5 Challenges Q15 Even Odd Counter
*/

public class EvenOddCounter {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int even = 0, odd = 0, number;
      
      // For loop
      for (int i = 0; i < 100; i++) {
         number = 1 + (int)(Math.random() * 100);
         if (isEven(number)) {
            even++;
         } else {
            odd++;
         }
      }
      
      // Output
      System.out.printf("Number of even numbers generated: %d", even);
      System.out.printf("\nNumber of odd numbers generated: %d", odd);
      
   } // Main method
   
   private static boolean isEven(int number) {
      
      if ((number % 2) == 0) {
         return true;
      } else {
         return false;
      }
      
   } // isEven method
   
} // End class