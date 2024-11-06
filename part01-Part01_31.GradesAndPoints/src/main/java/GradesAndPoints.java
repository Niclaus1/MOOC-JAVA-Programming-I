
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]");
        int value = Integer.valueOf(scan.nextLine());
        
        if (value > 100){
            System.out.println("incredible!");
        }else if (value <= 100 && value >= 90){
            System.out.println("5");
        }else if (value >= 80 && value <= 89){
            System.out.println("4");
        }else if (value >= 70 && value <= 79){
            System.out.println("3");
        }else if (value >= 60 && value <= 69){
            System.out.println("2");
        }else if (value >= 50 && value <= 59){
            System.out.println("1");
        }else if (value >= 0 && value <=49){
            System.out.println("failed");
        }else if (value < 0){
            System.out.println("impossible!");
        }
    }
}
