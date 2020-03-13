/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 6 Algorithm Workbench Q2
*/

import java.util.Scanner;

public class AlgorithmWorkbench2 {
   
   public static void main(String[] args) {
   
      // Declaring variables
      String title;
      String author;
      String publisher;
      int copiesSold;
      
      // Creating objects
      Book potter1 = new Book("Harry Potter and The Philosopher's Stone", "J.K. Rowling", "Bloomsbury", 500);
      Book potter2 = new Book();
      Book potter3 = new Book("Harry Potter and The Prisoner of Azkaban", "J.K. Rowling", "Bloomsbury", "500");
      
      // Calling setter method
      setter(potter2);
      
      // Calling getter method
      getter(potter1);
      getter(potter2);
      getter(potter3);
      
   } // Main method
   
   private static void setter(Book x) {
      
      // Declaring variables
      String title;
      String author;
      String publisher;
      String copiesSold;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining inputs
      System.out.print("Enter book title : ");
      title = keyboard.nextLine();
      System.out.print("Enter book author : ");
      author = keyboard.nextLine();
      System.out.print("Enter book publisher : ");
      publisher = keyboard.nextLine();
      System.out.print("Enter number of copies sold : ");
      copiesSold = keyboard.nextLine();
      
      x.setTitle(title);
      x.setAuthor(author);
      x.setPublisher(publisher);
      x.setCopiesSold(copiesSold);
      
   } // setter method
   
   private static void getter(Book x) {
      
      System.out.print("\n" + x.getTitle() + ", ");
      System.out.print(x.getAuthor() + ", ");
      System.out.print(x.getPublisher() + ", ");
      System.out.print(x.getCopiesSold());
      
   } // getter method
   
} // End class