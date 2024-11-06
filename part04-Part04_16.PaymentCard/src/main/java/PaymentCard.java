public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
    }

    public String toString(){
        return ("The card has a balance of " + this.balance + " euros");
    }

    public void eatAffordably(){
        this.balance = this.balance - (double )2.60;

        double checkNegative1 = this.balance;

        if(checkNegative1 < 0){
            this.balance = this.balance + 2.60;
        }
    }

    public void eatHeartily(){
        this.balance = this.balance - (double )4.60;

        double checkNegative2 = this.balance;
        
        if(checkNegative2 < 0){
            this.balance = this.balance + 4.60;
        }
    }

    public void addMoney(double amount){
        if(amount < 0){
            amount = amount + amount * -1;
        }
        this.balance = this.balance + amount;
        if (this.balance > 150){
            this.balance = 150;
        }
    }
}
