
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Items> item = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (Empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;

            }

            System.out.println("Name? (empty wil stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;

            }

            Items items = new Items(identifier, name);

            if (item.contains(items)) {
                continue;
            } else {
                item.add(items);
            }

        }

        System.out.println("?Items ?");
        for (Items items : item) {
            System.out.println(items.toString());

        }
        scanner.close();
    }
}
