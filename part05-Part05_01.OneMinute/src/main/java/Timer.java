public class Timer {
    private ClockHand second;
    private ClockHand hundredthsSecond;

    public Timer() {

        this.second = new ClockHand(60);
        this.hundredthsSecond = new ClockHand(100);

    }

    public void advance() {
        this.hundredthsSecond.advance();

        if (this.hundredthsSecond.value() == 0) {
            this.second.advance();
        }
    }

    public String toString() {
        return second + ":" + hundredthsSecond;
    }

}
