
public class HealthStation {

    private int countWeighing;

    public HealthStation() {
        this.countWeighing = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        countWeighing++;
        return person.getWeight();

    }

    public void feed(Person person) {
        countWeighing++;
        int currentWeight = person.getWeight();

        int addWeight = currentWeight + 1;

        person.setWeight(addWeight);

    }

    public int weighings() {
        return this.countWeighing;
    }

}
