/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 7 Challenges Q16 2D Array Operations
*/

public class TwoDArrayOperations {
   
   public static void main(String[] args) {
      
      // Declaring 2D array
      int[][] testData = new int[10][10];
      
      // Filling in array
      for (int row = 0; row < testData.length; row++) {
         for (int col = 0; col < testData[row].length; col++) {
            testData[row][col] = (int)(Math.random() * 100);
         }
      }
      
      // Output
      System.out.printf("The sum of the values in the array is %d", getTotal(testData));
      System.out.printf("\nThe average of the values in the array is about %.2f", getAverage(testData));
      int random = (int)(Math.random() * 10);
      System.out.printf("\nThe sum of the values in row %d is %d", random + 1, getRowTotal(testData, random));
      random = (int)(Math.random() * 10);
      System.out.printf("\nThe sum of the values in column %d is %d", random + 1, getColumnTotal(testData, random));
      random = (int)(Math.random() * 10);
      System.out.printf("\nThe highest value in row %d is %d", random + 1, getHighestInRow(testData, random));
      System.out.printf("\nThe lowest value in row %d is %d", random + 1, getLowestInRow(testData, random));
      
   } // Main method
   
   private static int getTotal(int[][] x) {
      
      // Declaring sum variable
      int sum = 0;
      
      // Nested for loops
      for (int row = 0; row < x.length; row++) {
         for (int col = 0; col < x[row].length; col++) {
            sum += x[row][col];
         }
      }
      
      // Returning sum
      return sum;
      
   } // getTotal method
   
   private static double getAverage(int[][] x) {
      
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
   
   private static int getRowTotal(int[][] x, int row) {
      
      // Declaring rowSum variable
      int rowSum = 0;
      
      // For loop
      for (int col = 0; col < x[row].length; col++) {
         rowSum += x[row][col];
      }
      
      // Returning rowSum
      return rowSum;
      
   } // getRowTotal method
   
   private static int getColumnTotal(int[][] x, int col) {
      
      // Declaring colSum variable
      int colSum = 0;
      
      // For loop
      for (int row = 0; row < x.length; row++) {
         colSum += x[row][col];
      }
      
      // Returning colSum
      return colSum;
      
   } // getColumnTotal method
   
   private static int getHighestInRow(int[][] x, int row) {
      
      // Declaring max variable
      int max = x[row][0];
      
      // For loop
      for (int col = 0; col < x[row].length; col++) {
         if (x[row][col] > max) {
            max = x[row][col];
         }
      }
      
      // Returning max
      return max;
      
   } // getHighestInRow method
   
   private static int getLowestInRow(int[][] x, int row) {
      
      // Declaring min variable
      int min = x[row][0];
      
      // For loop
      for (int col = 0; col < x[row].length; col++) {
         if (x[row][col] < min) {
            min = x[row][col];
         }
      }
      
      // Returning min
      return min;
      
   } // getLowestInRow method
   
} // End class