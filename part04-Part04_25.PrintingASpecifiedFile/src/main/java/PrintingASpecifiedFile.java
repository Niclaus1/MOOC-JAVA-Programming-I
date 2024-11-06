
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed? ");
        String file = scanner.nextLine();
        try (Scanner scan = new Scanner(Paths.get(file))){
            while (scan.hasNextLine()) {

                String data = scan.nextLine();

                System.out.println(data);
                
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " +e.getMessage());

        }
    }
}
