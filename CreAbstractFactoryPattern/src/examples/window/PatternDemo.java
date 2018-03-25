package examples.window;

import examples.window.client.GUIBuilder;
import examples.window.factories.AbstractWidgetFactory;
import examples.window.factories.MacOSXWidgetFactory;
import examples.window.factories.MsWindowsWidgetFactory;

public class PatternDemo {
	public static void main(String[] args) {
		String platform = args[0];
		GUIBuilder builder = new GUIBuilder();
		AbstractWidgetFactory widgetFactory = null;
		// check what platform we're on
		if (platform == "MACOSX") {
			widgetFactory = new MacOSXWidgetFactory();
		} else {
			widgetFactory = new MsWindowsWidgetFactory();
		}
		builder.buildWindow(widgetFactory);
	}
}
