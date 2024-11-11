import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Calculation calculation;
    private GradeDistribution grade;

    public UserInterface(Scanner scanner, Calculation calculation, GradeDistribution grade) {
        this.scanner = scanner;
        this.calculation = calculation;
        this.grade = grade;
    }

    public void start() {
        getPoints();
        printGradeDistribution();
    }

    public void getPoints() {
        System.out.println("Enter point totals, -1 stops: ");
        while (true) {
            int valuePoints = Integer.valueOf(scanner.nextLine());
            if (valuePoints == -1) {
                break;
            }
            if (valuePoints >= 0 && valuePoints <= 100) {
                calculation.addPoints(valuePoints);
                this.grade.addGradeBasedOnPoints(valuePoints);
            }
        }
        System.out.println(calculation);
    }

    public void printGradeDistribution() {
        int grades = 5;
        System.out.println("Grade distribution: ");
        while (grades >= 0) {
            int stars = grade.numberOfGrades(grades);
            System.out.print(grades + ": ");
            printStars(stars);
            System.out.println("");

            grades = grades - 1;
        }     
    }

    public static void printStars(int stars) {
        while (0 < stars) {
            System.out.print("*");
            stars--;
        }
    }

}