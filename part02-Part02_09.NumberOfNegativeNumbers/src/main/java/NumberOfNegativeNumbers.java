
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negative = 0;
        
        while(true){
            System.out.println("Give a number: ");
            int value = Integer.valueOf(scanner.nextLine());
            
            if(value == 0){
                break;
            }else if (value < 0){
                negative = negative + 1;
                continue;
            }
        }
        System.out.println("Number of negative numbers: " + negative);

    }
}
