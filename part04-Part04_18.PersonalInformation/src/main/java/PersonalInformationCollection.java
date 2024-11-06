
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("First name: ");
            String firstName  = scanner.nextLine();
            if(firstName.isEmpty()){
                break;
            }
            System.out.println("Second name: ");
            String secondName = scanner.nextLine();

            System.out.println("Identification number: ");
            String age = scanner.nextLine();


            infoCollection.add(new PersonalInformation(firstName, secondName, age));
            
        }   
        for (PersonalInformation collection : infoCollection ){
            System.out.println(collection.getFirstName() + " "+  collection.getLastName());
        }
    }
}
