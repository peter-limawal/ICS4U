/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 7 Weekend Assignment
*/

import java.util.Arrays;

public class WeekendAssignment {
   
   public static void main(String[] args) {
      
      // Declaring integer array of size 100
      int[] numbers = new int[100];
      
      // For loop to fill the array with random integers
      for (int i = 0; i < 100; i++) {
         
         numbers[i] = (int)(Math.random() * 100);
         
      }
      
      // Displaying the value of the array
      for (int j = 0; j < 10; j++) {
         
         for (int k = 0; k < 10; k++) {
            
            String x = Integer.toString(j) + Integer.toString(k);
            int y = Integer.parseInt(x);
            System.out.print(numbers[y] + " ");
            
         }
         
         System.out.print("\n");
         
      }
      
      // Finding the maximum value in the array
      int max = numbers[0];
      for (int l = 1; l < numbers.length; l++) {
         if (numbers[l] > max) {
            max = numbers[l];
         }
      }
      System.out.print("\nThe max value in the array is " + max);
      
      // Finding the minimum value in the array
      int min = numbers[0];
      for (int m = 1; m < numbers.length; m++) {
         if (numbers[m] < min) {
            min = numbers[m];
         }
      }
      System.out.print("\nThe min value in the array is " + min);
      
      // Finding the sum of all the values in the array
      int sum = numbers[0];
      for (int n = 1; n < numbers.length; n++) {
         sum += numbers[n];
      }
      System.out.print("\nThe sum of all the values in the array is " + sum);
      
      // Finding the average of all the values in the array
      double average = (double)sum / (double)numbers.length;
      System.out.print("\nThe average of all the values in the array is " + average);
      
   } // Main method
   
} // End class