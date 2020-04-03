public class Payroll {
   
   // Declaring arrays
   private int[] employeeId;
   private int[] hours;
   private double[] payRate;
   private double[] wages;
   
   public Payroll() {
      
      employeeId = new int[]{5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
      hours = new int[7];
      payRate = new double[7];
      wages = new double[7];
      
   } // Basic constructor
   
   public void setEmployeeId(int i, int a) {
      
      employeeId[i] = a;
      
   } // int employeeId mutator
   
   public void setEmployeeId(int i, String a) {
      
      employeeId[i] = Integer.parseInt(a);
      
   } // String employeeId mutator
   
   public void setHours(int i, int b) {
      
      hours[i] = b;
      
   } // int hours mutator
   
   public void setHours(int i, String b) {
      
      hours[i] = Integer.parseInt(b);
      
   } // String hours mutator
   
   public void setPayRate(int i, double c) {
      
      payRate[i] = c;
      
   } // double payRate mutator
   
   public void setPayRate(int i, String c) {
      
      payRate[i] = Double.parseDouble(c);
      
   } // String payRate mutator
   
   public void setWages(int i, double d) {
      
      wages[i] = d;
      
   } // double wages mutator
   
   public void setWages(int i, String d) {
      
      wages[i] = Double.parseDouble(d);
      
   } // String wages mutator
   
   public int getEmployeeId(int i) {
      
      return employeeId[i];
      
   } // employeeId accessor
   
   public int getHours(int i) {
      
      return hours[i];
      
   } // hours accessor
   
   public double getPayRate(int i) {
      
      return payRate[i];
      
   } // payRate accessor
   
   public double getWages(int i) {
      
      return wages[i];
      
   } // wages accessor
   
   public double grossPay(int x) {
      
      for (int i = 0; i < employeeId.length; i++) {
         if (employeeId[i] == x) {
            return hours[i] * payRate[i];
         }
      }
      
      // If ID does not exist
      return -1;
      
   } // grossPay calculator
   
} // End class