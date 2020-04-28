/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 5 Challenges Q14 Prime Number List
*/

import java.io.*;

public class PrimeNumberList {
   
   public static void main(String[] args) throws IOException {
      
      // Opening and writing file
      File fileOut = new File("PrimeNumberList.txt");
      PrintWriter out = new PrintWriter(fileOut);
      
      // For loop
      for (int i = 2; i < 100; i++) {
         
         boolean verdict = isPrime(i);
         if (verdict) {
            out.print(i + " ");
         }
         
      }
      
      out.close();
      
   } // Main method
   
   private static boolean isPrime(int num) {
      
      for (int i = 2; i <= (int)Math.sqrt(num); i++) {
         if (num % i == 0) {return false;}
      }
      
      return true;
      
   } // isPrime method
   
} // End class