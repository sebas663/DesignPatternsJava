package command.pattern;

public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        ConcreteReceiver receiver = new ConcreteReceiver();

        invoker.executeCommand(new ConcreteCommand(), receiver);
    }

}
