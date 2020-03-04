/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 16 Challenges Q9 Ackermann's Function
*/

import java.util.Scanner;

public class AckermannsFunction {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int m;
      int n;
      int end;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining m input
      System.out.print("Enter m : ");
      m = keyboard.nextInt();
      
      // Obtaining n input
      System.out.print("Enter n : ");
      n = keyboard.nextInt();
      
      // Calling ackermann method
      end = ackermann(m, n);
      
      // Output
      System.out.printf("The return value is %d", end);
      
   } // Main method
   
   private static int ackermann(int m, int n) {
      
      // Base case
      if (m == 0) {
         return n + 1;
      } if (n == 0) {
         return ackermann(m - 1, 1);
      }
      
      // Recursive case
      else {
         return ackermann(m - 1, ackermann(m, n - 1));
      }
      
   } // ackermann method
   
} // End class