
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList <String> lists = new ArrayList<>();

        try (Scanner scan = new Scanner(Paths.get(file))){
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                lists.add(data);
            }
            
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        } 
        System.out.println("Search for:");

        String searchedFor = scanner.nextLine();
        if(lists.contains(searchedFor)){
            System.out.println("Found!");
        }else if (!lists.contains(searchedFor)) {
            System.out.println("Not found.");                     
        }
        scanner.close();
    }
}
