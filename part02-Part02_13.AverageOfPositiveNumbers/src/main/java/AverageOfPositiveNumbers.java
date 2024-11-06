
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int total = 0;
        
        while(true){
            int value = Integer.valueOf(scanner.nextLine());
            
            if(value == 0){
                break;
            }else if (value > 0){
                sum = value + sum;
                total = total + 1;
            }
        }
        if (total > 0){
            double average = sum / total;
            System.out.println(average);
        }else{
            System.out.println("Cannot calculate average");
        }

    }
}
