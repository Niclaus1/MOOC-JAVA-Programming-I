import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserIntergface user = new UserIntergface(scanner);
        user.start();        
    }

}
