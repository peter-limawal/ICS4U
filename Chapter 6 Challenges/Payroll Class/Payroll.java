public class Payroll {
   
   // Declaring variables
   private String employeeName;
   private String idNumber;
   private double hourlyPayRate;
   private int numberOfHours;
   private double grossPay;
   
   public Payroll(String a, String b) {
      
      employeeName = a;
      idNumber = b;
      hourlyPayRate = 0;
      numberOfHours = 0;
      
   } // Basic constructor
   
   public Payroll() {
      
      employeeName = "";
      idNumber = "";
      hourlyPayRate = 0;
      numberOfHours = 0;
      
   } // No arg constructor
   
   public void setEmployeeName(String a) {
      
      employeeName = a;
      
   } // employeeName mutator
   
   public void setIdNumber(String b) {
      
      idNumber = b;
      
   } // idNumber mutator
   
   public void setHourlyPayRate(double c) {
      
      hourlyPayRate = c;
      
   } // double hourlyPayRate mutator
   
   public void setHourlyPayRate(String c) {
      
      hourlyPayRate = Double.parseDouble(c);
      
   } // String hourlyPayRate mutator
   
   public void setNumberOfHours(int d) {
      
      numberOfHours = d;
      
   } // int numberOfHours mutator
   
   public void setNumberOfHours(String d) {
      
      numberOfHours = Integer.parseInt(d);
      
   } // String numberOfHours mutator
   
   public String getEmployeeName() {
      
      return employeeName;
      
   } // employeeName accessor
   
   public String getIdNumber() {
      
      return idNumber;
      
   } // idNumber accessor
   
   public double getHourlyPayRate() {
      
      return hourlyPayRate;
      
   } // hourlyPayRate accessor
   
   public int getNumberOfHours() {
      
      return numberOfHours;
      
   } // numberOfHours accessor
   
   public void calculateGrossPay() {
      
      grossPay = numberOfHours * hourlyPayRate;
      
   } // grossPay calculator
   
   public double getGrossPay() {
      
      calculateGrossPay();
      return grossPay;
      
   } // grossPay calculator/accessor
   
} // End class