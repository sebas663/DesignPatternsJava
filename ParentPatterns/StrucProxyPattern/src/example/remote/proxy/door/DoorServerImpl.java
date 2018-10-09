package example.remote.proxy.door;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class DoorServerImpl extends java.rmi.server.UnicastRemoteObject implements DoorServer {
	/**
	 * HashMap used to store instances of DoorImpl. The map will be keyed by each
	 * DoorImpl's name attribute, so it is implied that two Doors with the same name
	 * are equivalent.
	 */
	private java.util.Hashtable hash = new java.util.Hashtable();

	public DoorServerImpl() throws java.rmi.RemoteException {
		// add a door to the hashmap
		DoorImpl impl = new DoorImpl("location1");
		hash.put(impl.getName(), impl);
	}

	/**
	 * @param location
	 *            - String value of the Door's location
	 * @return an object that implements Door, given the location
	 */
	public Door getDoor(String location) {
		return (Door) hash.get(location);
	}

	/**
	 * Bootstrap the server by creating an instance of DoorServer and binding its
	 * name in the RMI registry.
	 */
	public static void main(String[] args) {
		if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
		try {
            String name = "Compute";
        	DoorServerImpl server = new DoorServerImpl();
        	DoorServer stub = (DoorServer) UnicastRemoteObject.exportObject(server, 0);
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind(name, stub);
            System.out.println("ComputeEngine bound");
        } catch (Exception e) {
            System.err.println("ComputeEngine exception:");
            e.printStackTrace();
        }
	}

}
