import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class UserIntergface {
    private Scanner scanner;
    private String filename;
    private ArrayList<Recipe> recipes;

    public UserIntergface(Scanner scanner) {
        this.scanner = scanner;
        this.filename = "";
        this.recipes = new ArrayList<>();

    }
    // initialized program
    public void start() {
        System.out.print("File to read: ");
        this.filename = scanner.nextLine();
        System.out.println("");
        readingFile();
        commands();
    }
    // control command
    public void commands() {
        System.out.println("Commands:" + "\n"
                + "list - lists the recipes" + "\n"
                + "stop = stops the program" + "\n"
                + "find name - searches recipes by name" + "\n"
                + "find cooking time - searches recipes by cooking time" + "\n"
                + "find ingredient - searches recipes by ingredient");
        System.out.println("");

        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                System.out.println("Recipes: ");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            }
            if (command.equals("find name")) {
                System.out.print("Searched word:");
                String word = scanner.nextLine();

                for (Recipe recipe : recipes) {
                    if (recipe.getFoodName().contains(word)) {
                        System.out.println(recipe);
                    }
                }
            }
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time:");
                int time = scanner.nextInt();

                for (Recipe recipe : recipes) {
                    if (recipe.cookTime() <= time) {
                        System.out.println(recipe);
                    }
                }
            }
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredients = scanner.nextLine();

                for (Recipe recipe : recipes) {
                    if (recipe.getIngredients().contains(ingredients)) {
                        System.out.println("Recipes: ");
                        System.out.println(recipe);

                    }

                }
            }
        }
    }

    public void readingFile() {
        try (Scanner scan = new Scanner(Paths.get(filename))) {
            while (scan.hasNextLine()) {
                String food = scan.nextLine();
                int time = scan.nextInt();

                scan.nextLine();

                Recipe newRecipe = new Recipe(food, time);
                while (scan.hasNextLine()) {
                    String ingredients = scan.nextLine();
                    if (ingredients.isEmpty()) {
                        break;
                    }
                    newRecipe.addIngredients(ingredients);
                }
                recipes.add(newRecipe);
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + filename + " failed.");
        }
    }
}