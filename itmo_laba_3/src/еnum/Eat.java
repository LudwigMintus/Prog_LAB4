package еnum;

public enum Eat {
    EAT("скушал их"),
    SPOIL("испортил их");
    private final String translation;

    Eat(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}
