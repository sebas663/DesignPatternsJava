package examples.window.factories;

import examples.window.products.MSWindow;
import examples.window.products.Window;

//ConcreteFactory1
public class MsWindowsWidgetFactory implements AbstractWidgetFactory{
	// create an MSWindow
	public Window createWindow() {
		MSWindow window = new MSWindow();
		return window;
	}
}
