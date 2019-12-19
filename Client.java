import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;  
//mod6666
public class Client {  
	
   private Client() {}  
   
   public static void main(String[] args) {  
	   
      try {  
         // Getting the registry 
         Registry registry = LocateRegistry.getRegistry("192.168.1.7",5000); 
    
         // Looking up the registry for the remote object 
         RemoteInterface stub = (RemoteInterface) registry.lookup("RemoteInterface"); 
    
         // Calling the remote method using the obtained object 
         stub.printMsg(); 
         
         // System.out.println("Remote method invoked"); 
      } catch (Exception e) {
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      }  
   } 
}
