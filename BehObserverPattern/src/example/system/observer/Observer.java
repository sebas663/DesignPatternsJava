package example.system.observer;

import example.system.subject.Subject;

public abstract class Observer {
	protected Subject subject;

	public abstract void update();

}
