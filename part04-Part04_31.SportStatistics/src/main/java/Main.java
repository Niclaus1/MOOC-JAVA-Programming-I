import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File: ");
        String fileName = scanner.nextLine();

        System.out.println("Team: ");
        String team = scanner.nextLine();

        try (Scanner scan = new Scanner(Paths.get(fileName))){
            int wins = 0;
            int totalGames = 0;

            while (scan.hasNextLine()) {
                String data = scan.nextLine();

                if(data.isEmpty()){
                    continue;
                }

                String [] parts = data.split(",");

                String teamA = parts[0];
                String teamB = parts[1];
                int scoreA = Integer.valueOf(parts[2]);
                int scoreB = Integer.valueOf(parts[3]); 

                if (team.equals(teamA) || team.equals(teamB)) {
                    totalGames++;
                }

                if(team.equals(teamA) && scoreA > scoreB){
                    wins++;
                }else if(team.equals(teamB) && scoreA < scoreB){
                    wins++;
                }
            }
            System.out.println("Games: " + totalGames);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + (totalGames - wins));
            
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
