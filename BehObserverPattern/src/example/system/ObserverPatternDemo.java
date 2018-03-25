package example.system;

import example.system.observer.BinaryObserver;
import example.system.observer.HexaObserver;
import example.system.observer.OctalObserver;
import example.system.subject.Subject;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}
}
