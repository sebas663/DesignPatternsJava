package example.remote.proxy.door;

public interface DoorServer extends java.rmi.Remote {
	Door getDoor(String location) throws java.rmi.RemoteException;
}
