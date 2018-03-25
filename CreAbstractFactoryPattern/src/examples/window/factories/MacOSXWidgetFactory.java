package examples.window.factories;

import examples.window.products.MacOSXWindow;
import examples.window.products.Window;

//ConcreteFactory2
public class MacOSXWidgetFactory implements AbstractWidgetFactory{
	// create a MacOSXWindow
	public Window createWindow() {
		MacOSXWindow window = new MacOSXWindow();
		return window;
	}
}