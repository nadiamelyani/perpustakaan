import java.rmi.Remote; 
import java.rmi.RemoteException;  
import java.util.*;

public interface Book extends Remote {  
  public List<Books> getBooks() throws Exception;
}