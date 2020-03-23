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
   
   public double getMonthlyInterest() {
      
      return ((annualInterest / 12) / 100) * balance;
      
   } // getMonthlyInterest method
   
   public void addMonthlyInterest() {
      
      balance += ((annualInterest / 12) / 100) * balance;
      
   } // addMonthlyInterest method
   
   public void setBalance(double a) {
      
      balance = a;
      
   } // double balance mutator
   
   public void setBalance(String a) {
      
      balance = Double.parseDouble(a);
      
   } // String balance mutator
   
   public void setAnnualInterest(double b) {
      
      annualInterest = b;
      
   } // double annualInterest mutator
   
   public void setAnnualInterest(String b) {
      
      annualInterest = Double.parseDouble(b);
      
   } // String annualInterest mutator
   
   public double getBalance() {
      
      return balance;
      
   } // balance accessor
   
   public double getAnnualInterest() {
      
      return annualInterest;
      
   } // annualInterest accessor
   
} // End class