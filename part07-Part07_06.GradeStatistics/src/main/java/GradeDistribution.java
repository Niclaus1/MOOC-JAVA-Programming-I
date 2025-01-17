import java.util.ArrayList;

public class GradeDistribution{
    private ArrayList<Integer> grade;

    public GradeDistribution(){
        this.grade = new ArrayList<>();
    }
    
    public void addGradeBasedOnPoints(int point) {
        this.grade.add(pointsToGrade(point));
    }

    public int numberOfGrades(int grades) {
        int count = 0;
        for (int received : this.grade) {
            if (received == grades) {
                count++;
            }
        }
        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }


}