
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {

        ArrayList<Bird> birds = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("?");
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;

            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();

                Bird newBirds = new Bird(name, latinName);

                birds.add(newBirds);
            }

            if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();
                boolean found = false;

                for (Bird bird : birds) {
                    if (bird.getName().contains(name)) {
                        bird.addObservation();
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Not a bird!");
                }
            }

            if (command.equals("All")) {
                for (Bird bird : birds) {
                    System.out.println(bird);
                }
            }

            if (command.equals("One")) {
                System.out.print("Bird? ");
                String name = scan.nextLine();

                for (Bird bird : birds) {
                    if (bird.getName().contains(name)) {
                        System.out.println(bird);
                    }
                }
            }
        }
        scan.close();
    }
}