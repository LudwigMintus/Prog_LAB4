package еnum;
public enum Incident {

    HAPPENED("происшествие"),
    FUROR("фурор");
    private final String translation;

    Incident(String translation) {
        this.translation = translation;

    }
    @Override
    public String toString() {
        return translation;
    }
}
