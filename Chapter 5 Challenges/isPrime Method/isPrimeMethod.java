/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 5 Challenges Q13 isPrime Method
*/

import java.util.Scanner;

public class isPrimeMethod {
   
   public static void main(String[] args) {
     
     // Declaring variables
     int number;
     
     // Scanner object for input
     Scanner keyboard = new Scanner(System.in);
     
     // Obtaining number input
     System.out.print("Enter number to check for prime : ");
     number = keyboard.nextInt();
     
     // Parameter
     while (number <= 1) {
        System.out.print("ERROR! The smallest prime is 2!");
        System.out.print("\nEnter number to check for prime : ");
        number = keyboard.nextInt();
     }
     
     // Output
     if (isPrime(number)) {
        System.out.printf("\n%d is a prime!", number);
     } else {
        System.out.printf("\n%d is not a prime!", number);
     }
      
   }
   
   private static boolean isPrime(int num) {
      
      for (int i = 2; i <= (int)Math.sqrt(num); i++) {
         if (num % i == 0) {return false;}
      }
      
      return true;
      
   } // isPrime method
   
} // End class