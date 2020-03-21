public class SavingsAccount {
   
   // Declaring variables
   private double annualInterest;
   private double balance;
   
   public SavingsAccount(double a) {
      
      balance = a;
      
   } // Basic constructor
   
   public SavingsAccount(String a) {
      
      balance = Double.parseDouble(a);
      
   } // Modified constructor
   
   public SavingsAccount() {
      
      balance = 0;
      
   } // No arg constructor
   
   public void withdraw(double a) {
      
      balance -= a;
      
   } // double withdraw method
   
   public void withdraw(String a) {
      
      balance -= Double.parseDouble(a);
      
   } // String withdraw method
   
   public void deposit(double a) {
      
      balance += a;
      
   } // double deposit method
   
   public void deposit(String a) {
      
      balance += Double.parseDouble(a);
      
   } // String deposit method
   
   public void monthlyInterest() {
      
      balance += ((annualInterest / 12) / 100) * balance;
      
   } // monthlyInterest method
   
} // End class