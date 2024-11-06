
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(5);
        printStars(3);
        printStars(9);

        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        int i = 1;
        while (i <= number){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int square = 1;
        
        while (square <= size){
            printStars(size);
            square++;
            
        }
    }

    public static void printRectangle(int width, int height) {
        int rect = 1;
        
        while(rect <= height){
            printStars(width);
            rect++;
        }
    }

    public static void printTriangle(int size) {
        int tri = 1;
        while (tri <= size){
            printStars(tri);
            tri++;
        }
    }
}
