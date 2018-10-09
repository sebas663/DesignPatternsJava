package example.protection.proxy.server;

public class ProxyServer implements Server {

	RealServer srv;

	private int port;

	private String host;

	public ProxyServer(int port, String host) {
		this.port = port;
		this.host = host;
		srv = null;
		System.out.println("Proxy iniciado...");
	}

	public void download(String url) {
		if (!isRestricted(url)) {
			if (srv == null)
			{
				srv = new RealServer(port, host);
			}
			srv.download(url);
		} else {
			System.out.println("Actualmente se encuentra en un área que no permite la descarga del fichero.");
		}

	}

	public boolean isRestricted(String fichero)
	{
		return !fichero.equals("/descarga/prohibida.avi");
	}

}
