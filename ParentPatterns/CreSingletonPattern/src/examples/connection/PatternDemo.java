package examples.connection;

public class PatternDemo {
	public static void main(String[] args) {

		// illegal construct
		// Compile Time Error: The constructor Connection() is not visible
		// Connection object = new Connection();

		// Get the only object available
		Connection object = Connection.getInstance();

		// show the message
		object.showConnection();
	}
}
