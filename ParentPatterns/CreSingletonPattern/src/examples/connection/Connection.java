package examples.connection;

public class Connection {
	private static Connection conecction = null;

	private Connection() {
		super();
	}

	public static Connection getInstance() {
		if (conecction == null) {
			conecction = new Connection();
		}
		return conecction;
	}

	public void showConnection() {
		System.out.println("xxx porn!");
	}
}
