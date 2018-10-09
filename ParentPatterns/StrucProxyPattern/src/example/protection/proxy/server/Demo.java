package example.protection.proxy.server;

public class Demo {

	public static void main(String[] args) {
		// Creamos el proxy a la p�gina de descargas
        Server srv = new ProxyServer(20,"http://paginadedescarg.as");

        // Descargamos un archivo permitido

        srv.download("/descarga/permitida.avi");

        // En este punto ser� donde se cree el objeto RealServer
        // Vamos a probar ahora con una descarga restringida

        srv.download("/descarga/prohibida.avi");

	}

}
