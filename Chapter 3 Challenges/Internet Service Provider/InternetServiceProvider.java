/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 3 Challenges Q13 Internet Service Provider
*/

import java.util.Scanner; // Import Scanner class

public class InternetServiceProvider {
   
   public static void main(String[] args) {
      
      // Declaring variables
      String packageType;
      int hoursUsed;
      double charges = 0;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining packageType input
      System.out.print("Please enter the letter of the package you have purchased (A/B/C) : ");
      packageType = keyboard.nextLine();
      packageType = packageType.toUpperCase();
      
      // Obtaining hoursUsed
      System.out.print("Please enter the number of hours used : ");
      hoursUsed = keyboard.nextInt();
      
      // Switch statement to determine charges
      switch (packageType) {
         case "A":
            charges = 9.95 + ((hoursUsed - 10) * 2.00);
            break;
         case "B":
            charges = 13.95 + ((hoursUsed - 20) * 1.00);
            break;
         case "C":
            charges = 19.95;
            break;
         // Output statement if input is not within parameters
         default:
            System.out.print("\nERROR! Please enter a valid package! (A/B/C)");
            break;
      }
      
      // If statement if hours used does not match parameters
         if (hoursUsed < 0) {
            System.out.print("\nERROR! Number of hours used cannot be negative");
         }
      
      // If statement if packageType matches parameters
         if ((packageType.equals("A") || packageType.equals("B") || packageType.equals("C")) && (hoursUsed >= 0)) {
            
            // Output
            System.out.print("\nYou have selected package " + packageType + " and used it for " + hoursUsed + " hours");
            System.out.printf("\nYour total charge for this month is $%.2f", charges);
            
         }
      
   } // Main method
   
} // End class