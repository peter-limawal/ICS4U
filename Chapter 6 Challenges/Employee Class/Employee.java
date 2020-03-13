public class Employee {

   // Declaring variables
   private String name;
   private int idNumber;
   private String department;
   private String position;
   
   public Employee(String a, int b, String c, String d) {
      
      name = a;
      idNumber = b;
      department = c;
      position = d;
      
   } // Basic constructor
   
   public Employee(String a, int b) {
      
      name = a;
      idNumber = b;
      department = "";
      position = "";
      
   } // Modified constructor
   
   public Employee() {
      
      name = "";
      idNumber = 0;
      department = "";
      position = "";
      
   } // No arg constructor
   
   public void setName(String a) {
      
      name = a;
      
   } // name mutator
   
   public void setIdNumber(int a) {
      
      idNumber = a;
      
   } // int idNumber mutator
   
   public void setIdNumber(String a) {
      
      idNumber = Integer.parseInt(a);
      
   } // String idNumber mutator
   
   public void setDepartment(String a) {
      
      department = a;
      
   } // department mutator
   
   public void setPosition(String a) {
      
      position = a;
      
   } // position mutator
   
   public String getName() {
      
      return name;
      
   } // name accessor
   
   public int getIdNumber() {
      
      return idNumber;
      
   } // idNumber accessor
   
   public String getDepartment() {
      
      return department;
      
   } // department accessor
   
   public String getPosition() {
      
      return position;
      
   } // position accessor
   
} // End class