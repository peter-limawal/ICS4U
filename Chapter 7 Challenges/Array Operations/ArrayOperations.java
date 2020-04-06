/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 7 Challenges Q11 Array Operations
*/

public class ArrayOperations {
   
   public static void main(String[] args) {
      
      // Declaring array
      int[] testData = new int[200];
      
      // Filling in array
      for (int i = 0; i < testData.length; i++) {
         testData[i] = (int)(Math.random() * 200);
      }
      
      // Output
      System.out.printf("The sum of the values in the array is %d", getTotal(testData));
      System.out.printf("\nThe average of the values in the array is about %.2f", getAverage(testData));
      System.out.printf("\nThe highest value in the array is %d", getHighest(testData));
      System.out.printf("\nThe lowest value in the array is %d", getLowest(testData));
      
   } // Main method
   
   private static int getTotal(int[] x) {
      
      // Declaring sum variable
      int sum = 0;
      
      // For loop
      for (int i = 0; i < x.length; i++) {
         sum += x[i];
      }
      
      // Returning sum
      return sum;
      
   } // getTotal method
   
   private static double getAverage(int[] x) {
      
      // Declaring variables
      int sum;
      double average;
      
      // Calling getTotal method
      sum = getTotal(x);
      
      // Calculating average
      average = (double)(sum) / (double)(x.length);
      
      // Returning average
      return average;
      
   } // getAverage method
   
   private static int getHighest(int[] x) {
      
      // Declaring variable
      int max = -1;
      
      // Finding maximum value
      for (int i = 0; i < x.length; i++) {
         if (x[i] > max) {
            max = x[i];
         }
      }
      
      // Returning max
      return max;
      
   } // getHighest method
   
   private static int getLowest(int[] x) {
      
      // Declaring variable
      int min = 9999;
      
      // Finding minimum value
      for (int i = 0; i < x.length; i++) {
         if (x[i] < min) {
            min = x[i];
         }
      }
      
      // Returning min
      return min;
      
   } // getLowest method
   
} // End class