package adhoc9;

public class MaxWeightContainer {
    private Weighable heaviest;

    public void store(Weighable element) {
        if (heaviest == null || element.getWeight() > heaviest.getWeight()) {
            heaviest = element;
        }
    }

    public Weighable getHeaviest() {
        return heaviest;
    }
}
