/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q10 Largest and Smallest
*/

import java.util.Scanner;

public class LargestAndSmallest {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int largest = -2147483648;
      int smallest = 2147483647;
      int number;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining number input
      System.out.print("Enter an integer (enter -99 to end program) : ");
      number = keyboard.nextInt();
      
      // Parameters
      if (number == -99) {
         
         largest = number;
         smallest = number;
         
      }
      while (number != -99) {
         
         if (number > largest) {
            
            largest = number;
            
         } 
         if (number < smallest) {
            
            smallest = number;
            
         } 
         else {
            
            // Reobtaining number input
            System.out.print("Enter another integer (enter -99 to end program) : ");
            number = keyboard.nextInt();
         }
         
      }
      
      System.out.print("\nSmallest number : " + smallest);
      System.out.print("\nLargest number : " + largest);
      
   }
   
}