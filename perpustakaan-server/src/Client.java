import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;  
import java.util.*;
public class Client {  
   private Client() {}  
   public static void main(String[] args) {  
      try { 
         // Getting the registry 
         Registry registry = LocateRegistry.getRegistry(null); 
    
         // Looking up the registry for the remote object 
         Book stub = (Book) registry.lookup("Book"); 
    
         // Calling the remote method using the obtained object 
         List<Books> list = (List<Books>) stub.getBooks(); 
         for (Books s:list) { 
            
            // System.out.println("bc "+s.getBranch()); 
            System.out.println("ID: " + s.getId()); 
            System.out.println("Judul: " + s.getJudul()); 
            System.out.println("Penerbit: " + s.getPenerbit()); 
            System.out.println("Pengarang: " + s.getPengarang()); 
            System.out.println("Stok: " + s.getStok()); 
            System.out.println("Batas Peminjaman: " + s.getBatasPeminjaman()); 
         }  
      // System.out.println(list); 
      } catch (Exception e) { 
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}