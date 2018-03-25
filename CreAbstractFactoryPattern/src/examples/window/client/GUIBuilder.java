package examples.window.client;

import examples.window.factories.AbstractWidgetFactory;
import examples.window.products.Window;

//Client
public class GUIBuilder {
	public void buildWindow(AbstractWidgetFactory widgetFactory) {
		Window window = widgetFactory.createWindow();
		window.setTitle("New Window");
	}
}
