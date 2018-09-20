package example.spells.commands;

public enum Age {
    CHILD("small"), ADULT("adult"), ELDER("elder"), UNDEFINED("");

    private String title;

    Age(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
