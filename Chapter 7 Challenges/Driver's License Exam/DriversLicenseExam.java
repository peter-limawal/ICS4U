/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 7 Challenges Q6 Driver's License Exam
*/

import java.util.Scanner;

public class DriversLicenseExam {
   
   public static void main(String[] args) {
      
      // Declaring array
      String[] answers = new String[20];
      int[] wrongQ = new int[20];
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Creating object
      DriverExam test = new DriverExam();
      
      // For loop
      for (int i = 0; i < answers.length; i++) {
         System.out.printf("Enter answer (A/B/C/D) for Q%d : ", (i + 1));
         answers[i] = keyboard.nextLine();
         // Parameter
         while (answers[i].equals("A") == false &&
                answers[i].equals("B") == false &&
                answers[i].equals("C") == false &&
                answers[i].equals("D") == false) {
                
                  System.out.print("ERROR! The only answers are A/B/C/D!");
                  System.out.printf("\nEnter answer (A/B/C/D) for Q%d : ", (i + 1));
                  answers[i] = keyboard.nextLine();
                  
         }
      }
      
      // Calling setStudentAnswers method
      test.setStudentAnswers(answers);
      
      // Calling questionsMissed method
      wrongQ = test.questionsMissed();
      
      // Output
      System.out.printf("\nTotal correct answers: %d", test.totalCorrect());
      System.out.printf("\nTotal wrong answers: %d", test.totalIncorrect());
      System.out.print("\nWrong questions: ");
      for (int j = 0; j < answers.length; j++) {
         if (wrongQ[j] == 0) {
            break;
         }
         System.out.print("Q" + wrongQ[j] + " ");
      }
      if (test.passed() == true) {
         System.out.print("\nTest result: PASS");
      } else if (test.passed() == false) {
         System.out.print("\nTest result: FAIL");
      }
      
   } // Main method
   
} // End class