import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList <Books> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scan.nextLine();
            
            if (title.isEmpty()) {
                break;
                
            }

            System.out.print("Pages: ");
            int page = Integer.valueOf(scan.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scan.nextLine());

            books.add(new Books(title, page, year));           
        }   
            System.out.println();
            System.out.print("What information will be printed? ");
            
            String request = scan.nextLine();
            
            if (request.equals("everything")) {
                for(Books requests : books){
                    System.out.println(requests);
                }               
            }
            
            if (request.equals("name")) {
                for(Books requests : books){
                    System.out.println(requests.getName());
                }
                
            }
    }
}
