
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the speed: ");
        int value = Integer.valueOf(scanner.nextLine());

        if (value > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}
