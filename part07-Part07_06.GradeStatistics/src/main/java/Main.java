
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculation newCalculation = new Calculation();
        GradeDistribution grade = new GradeDistribution();
        UserInterface ui = new UserInterface(scanner, newCalculation, grade);
        ui.start();
    }
}
