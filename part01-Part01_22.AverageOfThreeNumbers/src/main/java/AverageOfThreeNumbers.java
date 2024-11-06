
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int value1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number: ");
        int value2 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the third number: ");
        int value3 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The average is " + ((value1+value2+value3)/(double)(3)));

    }
}
