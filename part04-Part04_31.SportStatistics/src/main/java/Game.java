public class Game {
    private String teamA;
    private String teamB;
    private int scoreA;
    private int scoreB;

    public Game(String teamA, String teamB, int scoreA, int scoreB){
        this.teamA = teamA;
        this.teamB = teamB;
        this.scoreA = scoreA;
        this.scoreB = scoreB;
    }

    public String getTeamA(){
        return this.teamA;
    }

    public String getTeamB(){
        return this.teamB;
    }
    
    public boolean winnerIs(String team) {
        if (team.equals(teamA) && scoreA > scoreB) {
            return true;
        }
    
        if (team.equals(teamB) && scoreB > scoreA) {
            return true;
        }
    
        return false;   
    }
    
}
