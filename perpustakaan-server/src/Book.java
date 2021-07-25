import java.rmi.Remote; 
import java.rmi.RemoteException;  

public interface Book extends Remote {  
  void printMsg() throws RemoteException;  
}