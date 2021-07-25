import java.util.*;
import java.sql.*; 

public class ImplementBook implements Book {
   public List<Books> getBooks() throws Exception {  
      List<Books> list = new ArrayList<Books>();   
    
      // JDBC driver name and database URL 
      String JDBC_DRIVER = "com.mysql.jdbc.Driver";   
      String DB_URL = "jdbc:mysql://localhost:3306/dbperpustakaan";  
      System.out.println("TESSSSSS");
      
      // Database credentials 
      String USER = "root"; 
      String PASS = "";  
      
      Connection conn = null; 
      Statement stmt = null;  
      
      //Register JDBC driver 
      System.out.println("TESSSSSS2");
      try {
         Class.forName(JDBC_DRIVER);
      } 
      catch (ClassNotFoundException e) {
         System.out.println("MySQL JDBC Driver not found !!");
      }
      
      System.out.println("TESSSSSS3");
      //Open a connection 
      conn = DriverManager.getConnection(DB_URL, USER, PASS); 
      System.out.println("Connected database successfully...");  
      
      //Execute a query 
      System.out.println("Creating statement..."); 
      
      stmt = conn.createStatement();  
      String sql = "SELECT * FROM data_buku"; 
      ResultSet rs = stmt.executeQuery(sql);  
      
      //Extract data from result set 
      while(rs.next()) { 
         // Retrieve by column name 
         String id_data  = rs.getString("id_data"); 
         String penerbit = rs.getString("penerbit"); 
         String judul = rs.getString("judul"); 
         String pengarang = rs.getString("pengaranng");  
         int stok = rs.getInt("stok"); 
         int batas_peminjam = rs.getInt("batas_peminjam");
         
         // Setting the values 
         // Student student = new Student(); 
         // student.setID(id); 
         // student.setName(name); 
         // student.setBranch(branch); 
         // student.setPercent(percent); 
         // student.setEmail(email); 
         // list.add(student); 
      } 
      rs.close(); 
      return list;     
   }  
} 