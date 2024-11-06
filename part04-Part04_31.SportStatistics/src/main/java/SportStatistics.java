
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
           
        System.out.println("File: ");
        String filename = scan.nextLine();

        ArrayList<Game> games = gameData(filename);
        System.out.println("Team: ");
        String team = scan.nextLine();

        ArrayList <Game> teamGames = new ArrayList<>();

        for(Game game : games){
            if(team.equals(game.getTeamA()) || team.equals(game.getTeamB())){
                teamGames.add(game);
            }
        }

        System.out.println("Games: " + teamGames.size());

        int wins = 0;
        for(Game game : teamGames){
            if(game.winnerIs(team))
                wins = wins + 1;
        } 
        System.out.println("Wins: " + wins);
        System.out.println("Loss: " + (teamGames.size() - wins));
    }  
    
    public static ArrayList<Game> gameData (String fileName){
        ArrayList<Game> games = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(fileName))){
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();

                if(data.isEmpty()){
                    continue;
                }

                String [] parts = data.split(",");

                String teamA = parts[0];
                String teamB = parts[1];
                int scoreTeamA = Integer.valueOf(parts[2]);
                int scoreTeamB = Integer.valueOf(parts[3]);

                games.add(new Game(teamA, teamB, scoreTeamA, scoreTeamB));

                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());     
           }
        return games;
    }
}
