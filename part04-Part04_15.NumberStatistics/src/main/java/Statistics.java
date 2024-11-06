
public class Statistics {
    private int count;
    private int sum;

    public Statistics(){
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number){
        this.count++;
        this.sum = this.sum + number;

    }

    public int getCount(){
        return this.count;
    }

    public int sum(){
        return this.sum; 
    }

    public double average(){
        double average = this.sum / (double) this.count;

        if(this.count == 0){
            average = 0;
        }
        return  average;
    }
}
