package example.spells.commands;

import example.spells.Target;

public class AgeSpell extends Command {

    private Age previousAge;
    private Target target;


    @Override
    public void execute(Target target) {
        previousAge = target.getAge();
        target.setAge(Age.ELDER);
        this.target = target;
    }

    @Override
    public void undo() {
        if (previousAge != null && target != null) {
            Age temp = target.getAge();
            target.setAge(previousAge);
            previousAge = temp;
        }
    }

    @Override
    public void redo() {
        undo();
    }

    @Override
    public String toString() {
        return "Age Spell";
    }
}
