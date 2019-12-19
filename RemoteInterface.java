import java.rmi.Remote; 
import java.rmi.RemoteException;  

// Crea interfaccia remota "RemoteInterface" che sar� implementata da "InterfaceImplementation"
// Dichiara i Metodi

public interface RemoteInterface extends Remote {  
   void printMsg() throws RemoteException;  
} 