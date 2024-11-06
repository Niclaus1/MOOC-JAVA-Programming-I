
public class PaymentTerminal {

    private double money; // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals; // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.affordableMeals = 0;
        this.heartyMeals = 0;
        this.money = 1000;

    }

    public double eatAffordably(double payment) {

        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the
        // change
        // if the payment parameter is not large enough, no meal is sold and the method
        // should return the whole payment
        double change = 0;
        if (payment >= 2.50) {
            affordableMeals++;
            change = payment - 2.50;
            this.money = this.money + 2.50;
            return change;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the
        // change
        // if the payment parameter is not large enough, no meal is sold and the method
        // should return the whole payment
        double change = 0;
        if (payment >= 4.30) {
            heartyMeals++;
            change = payment - 4.30;
            this.money = this.money + 4.30;
            return change;
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card) {
        double balance = card.balance();
        if (balance >= 2.50) {
            affordableMeals++;
            card.takeMoney(2.50);
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        double balance = card.balance();
        if (balance >= 4.30) {
            heartyMeals++;
            card.takeMoney(4.30);
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}
