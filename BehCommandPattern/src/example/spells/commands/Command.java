package example.spells.commands;

import example.spells.Target;

public abstract class Command {

    public abstract void execute(Target target);
    public abstract void undo();
    public abstract void redo();

    @Override
    public abstract String toString();

}
