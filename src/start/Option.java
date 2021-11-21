package start;

public class Option {

    private final String description;
    private final boolean isChosen;

    public Option(String description, boolean isChosen) {
        this.description = description;
        this.isChosen = isChosen;
    }

    public Option(Option odlOption, boolean isChosen) {
        this.description = odlOption.description;
        this.isChosen = isChosen;
    }

    @Override
    public String toString() {
        return "start.Option{" +
                "description='" + description + '\'' +
                ", isChosen=" + isChosen +
                '}';
    }
}
