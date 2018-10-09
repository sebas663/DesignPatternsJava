package example.protection.proxy.server;

public class RealServer implements Server {

	private int port;

	private String host;

	public RealServer(int port, String host) {

		this.port = port;

		this.host = host;

		System.out.println("Servidor iniciado...");

	}

	public void download(String url) {

		System.out.println("Descargando " + host + ":" + port + "/" + url);

	}

}
