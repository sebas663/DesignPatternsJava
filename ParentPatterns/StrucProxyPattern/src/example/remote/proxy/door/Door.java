package example.remote.proxy.door;

public interface  Door extends java.rmi.Remote {
	
	String getLocation() throws java.rmi.RemoteException;

	boolean isOpen() throws java.rmi.RemoteException;

}
