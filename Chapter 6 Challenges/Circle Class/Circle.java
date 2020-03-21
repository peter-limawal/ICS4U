public class Circle {
   
   // Declaing variables
   private double radius;
   private double PI = 3.14159;
   private double area;
   private double diameter;
   private double circumference;
   
   public Circle(double a) {
      
      radius = a;
      
   } // Basic constructor
   
   public Circle(String a) {
      
      radius = Double.parseDouble(a);
      
   } // Modified constructor
   
   public Circle() {
      
      radius = 0.0;
      
   } // No arg constructor
   
   public void setRadius(double a) {
      
      radius = a;
      
   } // double radius mutator
   
   public void setRadius(String a) {
      
      radius = Double.parseDouble(a);
      
   } // String radius mutator
   
   public double getRadius() {
      
      return radius;
      
   } // radius accessor
   
   public void calculateArea() {
      
      area = PI * radius * radius;
      
   } // area calculator
   
   public double getArea() {
      
      calculateArea();
      return area;
      
   } // area accessor
   
   public void calculateDiameter() {
      
      diameter = radius * 2;
      
   } // diameter calculator
   
   public double getDiameter() {
      
      calculateDiameter();
      return diameter;
      
   } // diameter accessor
   
   public void calculateCircumference() {
      
      circumference = 2 * PI * radius;
      
   } // circumference calculator
   
   public double getCircumference() {
      
      calculateCircumference();
      return circumference;
      
   } // circumference accessor
   
} // End class