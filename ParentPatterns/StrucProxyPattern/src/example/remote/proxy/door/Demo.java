package example.remote.proxy.door;

import java.math.BigDecimal;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Demo {
//	In java RMI an object on one machine (executing in one JVM) called a client 
//	can invoke methods on an object in another machine (another JVM) the second 
//	object is called a remote object. The proxy (also called a stub) resides on 
//	the client machine and the client invokes the proxy in as if it is invoking 
//	the object itself (remember that the proxy implements the same interface that 
//	RealSubject implements). The proxy itself will handle communication 
//	to the remote object, invoke the method on that remote object, and would return 
//	the result if any to the client. The proxy in this case is a Remote proxy.
	public static void main(String[] args) {
		 if (System.getSecurityManager() == null) {
	            System.setSecurityManager(new SecurityManager());
	        }
	        try {
	            String name = "Compute";
	            Registry registry = LocateRegistry.getRegistry(args[0]);
	            DoorServer stub = (DoorServer) registry.lookup(name);
	            Door theDoor = stub.getDoor("location1");
	            // invoke methods on the returned Door
	            if (theDoor.isOpen())
	            {
	               // handle the door-open case ...
	            }
	        
	        } catch (Exception e) {
	            System.err.println("ComputePi exception:");
	            e.printStackTrace();
	        }

	}

}
