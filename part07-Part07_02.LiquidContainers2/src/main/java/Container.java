public class Container {
    private int amount;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return amount;
    }

    public void add(int value) {
        if (value >= 0) {
            this.amount += value;
        }
        if (amount > 100) {
            amount = 100;
        }
    }

    public void remove(int value) {
        this.amount -= value;
        if (amount < 0) {
            amount = 0;
        }
    }

    public String toString() {
        return this.amount + "/" + "100";
    }
}