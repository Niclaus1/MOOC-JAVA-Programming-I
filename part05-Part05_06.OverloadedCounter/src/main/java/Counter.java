public class Counter {
    private int startValue;

    public Counter(int startValue) {
        this.startValue = startValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return startValue;
    }

    public void increase() {
        startValue = startValue + 1;
    }

    public void decrease() {
        startValue = startValue - 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            increaseBy = 0;
        }
        startValue = startValue + increaseBy;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            decreaseBy = 0;
        }
        startValue = startValue - decreaseBy;
    }
}
