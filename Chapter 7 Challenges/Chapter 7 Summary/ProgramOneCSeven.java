/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 7 Program One
*/

public class ProgramOneCSeven {
   
   public static void main(String[] args) {
      
      // Declaring array
      int[] numbers = new int[20];
      
      // Filling in the array with random numbers
      for (int i = 0; i < numbers.length; i++) {
         numbers[i] = (int)(Math.random() * 10) + 1;
      }
      
      // Declaring variables
      int max, min, sum, range;
      double average;
      
      // Obtaining variable values
      max = findMax(numbers);
      min = findMin(numbers);
      sum = findSum(numbers);
      average = findAve(numbers);
      range = max - min;
      
      // Output
      System.out.print("The array is: ");
      for (int i = 0; i < numbers.length; i++) {
         System.out.print(numbers[i] + " ");   
      }
      System.out.print("\nThe sum of the array values are: " + sum);
      System.out.printf("\nThe average of the array values is: %.2f", average);
      System.out.print("\nThe difference between the largest and smallest array values is: " + range);
      
   } // Main method
   
   // Algorithm to find max value in an array
   private static int findMax(int[] numbers) {
      
      // Declaring variable
      int max = numbers[0];
      
      // For loop
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] > max) {
            max = numbers[i];
         }
      }
      
      // Returning max
      return max;
      
   } // findMax method
   
   // Algorithm to find min value in an array
   private static int findMin(int[] numbers) {
      
      // Declaring variable
      int min = numbers[0];
      
      // For loop
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] < min) {
            min = numbers[i];
         }
      }
      
      // Returning min
      return min;
      
   } // findMin method
   
   // Algorithm to find sum of array
   private static int findSum(int[] numbers) {
      
      // Declaring variable
      int sum = 0;
      
      // For loop
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      
      // Returning sum
      return sum;
      
   } // findSum method
   
   // Algorithm to find average of array
   private static double findAve(int[] numbers) {
      
      // Declaring variable
      int sum;
      double average;
      
      // Calling findSum method
      sum = findSum(numbers);
      
      // Finding average
      average = (double)(sum) / (double)(numbers.length);
      
      // Returning average
      return average;
      
   } // findAve method
   
} // End class