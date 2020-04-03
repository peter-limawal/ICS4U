public class DriverExam {
   
   private String[] answerKey;
   private String[] studentAnswers;
   private int correctAnswers;
   private int wrongAnswers;
   private int[] wrongQuestions;
   
   public DriverExam() {
      
      answerKey = new String[]{"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", "B", "C", "D", "A", "D", "C", "C", "B", "D", "A"};
      studentAnswers = new String[20];
      correctAnswers = 0;
      wrongAnswers = 0;
      wrongQuestions = new int [20];
      
   } // Basic constructor
   
   public void setStudentAnswers(String[] x) {
      
      studentAnswers = x;
      
   } // studentAnswers mutator
   
   public boolean passed() {
      
      // Counter variable
      int count = 0;
      
      // For loop
      for (int i = 0; i < answerKey.length; i++) {
         if (count > 5) {
            return false;
         }
         else {
            if (answerKey[i].equals(studentAnswers[i]) == false) {
               count++;
            }
         }
      }
      
      // Return value if passes for loop
      return true;
      
   } // passed method
   
   public int totalCorrect() {
      
      // For loop
      for (int j = 0; j < answerKey.length; j++) {
         if (answerKey[j].equals(studentAnswers[j]) == true) {
            correctAnswers++;
         }
      }
      
      return correctAnswers;
      
   } // totalCorrect method
   
   public int totalIncorrect() {
      
      // For loop
      for (int k = 0; k < answerKey.length; k++) {
         if (answerKey[k].equals(studentAnswers[k]) == false) {
            wrongAnswers++;
         }
      }
      
      return wrongAnswers;
      
   } // totalIncorrect method
   
   public int[] questionsMissed() {
      
      // Counter variable
      int x = 0;
      
      // For loop
      for (int l = 0; l < answerKey.length; l++) {
         if (answerKey[l].equals(studentAnswers[l]) == false) {
            wrongQuestions[x] = l + 1;
            x++;
         }
      }
      
      return wrongQuestions;
      
   }
   
} // End class