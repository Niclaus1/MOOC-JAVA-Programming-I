
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {

        int newMoneyEuros = this.euros + addition.euros;
        int newMoneyCents = this.cents + addition.cents;

        if (newMoneyCents > 99) {
            newMoneyEuros = newMoneyEuros + newMoneyCents / 100;
            newMoneyCents = newMoneyCents % 100;
        }

        Money newMoney = new Money(newMoneyEuros, newMoneyCents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {

        if (this.euros < compared.euros) {
            return true;
        }

        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;

        }

        return false;
    }

    public Money minus(Money decrease) {
        int newMoneyEuros = this.euros - decrease.euros;
        int newMoneyCents = this.cents - decrease.cents;

        if (newMoneyCents > 99) {
            newMoneyEuros = newMoneyEuros + newMoneyCents / 100;
            newMoneyCents = newMoneyCents % 100;
        }

        if (newMoneyCents < 0) {
            newMoneyEuros--;
            newMoneyCents += 100;
        }

        if (newMoneyEuros < 0) {
            newMoneyCents = 0;
            newMoneyEuros = 0;
        }

        Money newMoney = new Money(newMoneyEuros, newMoneyCents);

        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
