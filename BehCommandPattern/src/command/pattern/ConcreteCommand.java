package command.pattern;

public class ConcreteCommand extends Command {

    private Receiver receiver;

    @Override
    public void execute(Receiver receiver) {
        receiver.doAction();
        this.receiver = receiver;
    }

}
