package command.pattern;

public class ConcreteReceiver extends Receiver {

    @Override
    public void doAction() {
        System.out.println("Action on CONCRETE receiver");
    }

}
