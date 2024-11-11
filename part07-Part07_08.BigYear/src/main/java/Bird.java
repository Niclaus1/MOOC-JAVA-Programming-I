public class Bird {
    private String name;
    private String latinName;
    private int observationCount;

    public Bird(String name, String latinName) {
        this.observationCount = 0;
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return this.name + "(" + latinName + "): ";
    }

    public void addObservation() {
        this.observationCount++;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return getName() + observationCount + " observations";
    }
}