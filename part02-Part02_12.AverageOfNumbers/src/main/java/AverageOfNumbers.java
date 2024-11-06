
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int total = 0;
        
        while(true){
            System.out.println("Give a number: ");
            int value = Integer.valueOf(scanner.nextLine());
            
            if(value == 0){
                break;
            }else{
                sum = value + sum;
                total = total + 1;
                continue;
            }
        }
        double average = sum / total;
        System.out.println("Average of the numbers: " + average);
    }
}
