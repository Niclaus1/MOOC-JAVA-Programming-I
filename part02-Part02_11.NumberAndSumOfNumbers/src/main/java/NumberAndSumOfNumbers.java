
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int total = 0;
        
        while(true){
            System.out.println("Give a number: ");
            int value = Integer.valueOf(scanner.nextLine());
            
            if(value == 0){
                break;
            }else{
                sum = sum + value;
                total = total + 1;
                continue;
            }
        }
        System.out.println("Number of numbers: "+ total);
        System.out.println("Sum of the numbers: "+ sum);
    }
}
