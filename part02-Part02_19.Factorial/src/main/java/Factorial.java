
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Give a number: ");
        int value = Integer.valueOf(scanner.nextLine());
        int factor = 1;
        for (int i = 1; i <= value; i++){
            factor*=i;
        }
        System.out.println(factor);
    }
}
