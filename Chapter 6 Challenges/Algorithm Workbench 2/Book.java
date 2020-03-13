public class Book {
   
   private String title;
   private String author;
   private String publisher;
   private int copiesSold;
   
   public Book() {
      
      title = "";
      author = "";
      publisher = "";
      copiesSold = 0;
      
   }
   
   public Book(String a, String b, String c, int d) {
      
      title = a;
      author = b;
      publisher = c;
      copiesSold = d;
      
   }
   
   public Book(String a, String b, String c, String d) {
      
      title = a;
      author = b;
      publisher = c;
      copiesSold = Integer.parseInt(d);
      
   }
   
   public void setTitle(String a) {
      
      title = a;
      
   }
   
   public void setAuthor(String a) {
      
      author = a;
      
   }
   
   public void setPublisher(String a) {
      
      publisher = a;
      
   }
   
   public void setCopiesSold(int a) {
      
      copiesSold = a;
      
   }
   
   public void setCopiesSold(String a) {
      
      copiesSold = Integer.parseInt(a);
      
   }
   
   public String getTitle() {
      
      return title;
      
   }
   
   public String getAuthor() {
      
      return author;
      
   }
   
   public String getPublisher() {
      
      return publisher;
      
   }
   
   public int getCopiesSold() {
      
      return copiesSold;
      
   }
   
}