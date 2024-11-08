
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstValue = 0;
        int secondValue = 0;

        while (true) {

            System.out.println("First: " + firstValue + "/100");
            System.out.println("Second: " + secondValue + "/100");

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            if (parts.length != 2) {
                break;
            }

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (amount < 0) {
                amount = 0;
            }

            if (command.equals("add")) {

                firstValue += amount;
                if (firstValue >= 100) {
                    firstValue = 100;
                }

            }

            if (command.equals("move")) {

                if (firstValue == 0 && amount > 0) {
                    secondValue -= amount;
                }
                if (firstValue < amount) {
                    secondValue += firstValue;
                }

                if (firstValue > amount) {
                    secondValue += amount;
                }

                firstValue -= amount;

                if (firstValue == 0) {
                    secondValue += amount;
                }
            }

            if (command.equals("remove")) {
                if (secondValue < 0) {
                    secondValue = 0;
                }

            }

        }
        scan.close();
    }

}
