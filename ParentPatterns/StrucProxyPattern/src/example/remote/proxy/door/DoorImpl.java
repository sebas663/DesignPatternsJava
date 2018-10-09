package example.remote.proxy.door;

public class DoorImpl extends java.rmi.server.UnicastRemoteObject implements Door {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7893718680207919317L;
	private final String name;
	private boolean open = false;

	public DoorImpl(String name) throws java.rmi.RemoteException {
		super();
		this.name = name;
	}

	// in this implementation, each Door's name is the same as its
	// location.
	// we're also assuming the name will be unique.
	public String getLocation() {
		return name;
	}

	public boolean isOpen() {
		return open;
	}

	// assume the server side can call this method to set the
	// state of this door at any time
	void setOpen(boolean open) {
		this.open = open;
	}

	// convenience method for server code
	String getName() {
		return name;
	}

	// override various Object utility methods
	public String toString() {
		return "DoorImpl:[" + name + "]";
	}

	// DoorImpls are equivalent if they are in the same location
	public boolean equals(Object obj) {
		if (obj instanceof DoorImpl) {
			DoorImpl other = (DoorImpl) obj;
			return name.equals(other.name);
		}
		return false;
	}

	public int hashCode() {
		return toString().hashCode();
	}
}
