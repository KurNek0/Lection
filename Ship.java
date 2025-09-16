public class Ship {
    private final double draft;
    private final int crew;

    public Ship(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }

    public boolean isWorthIt() {
        double actualCargoWeight = draft - (crew * 1.5);
        return actualCargoWeight > 20;
    }
}