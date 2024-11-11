import java.util.ArrayList;

public class Calculation {

    private ArrayList<Integer> points;
    private double totalPassingPoints;

    public Calculation() {
        this.points = new ArrayList<>();
        this.totalPassingPoints = 0;
    }

    public void addPoints(int point) {
        this.points.add(point);
    }

    public double pointAverage() {
        double sum = 0;
        totalPassingPoints = 0;

        for (int values : points) {
            sum += values;
        }
        return sum / points.size();
    }

    public double passingAverage() {
        double sum = 0;
        totalPassingPoints = 0;

        for (int values : points) {
            if (values >= 50) {
                sum += values;
                totalPassingPoints++;
            }
        }
        if (totalPassingPoints == 0) {
            return 0;
        }
        return sum / totalPassingPoints;
    }

    public double percentageAverage() {
        if (passingAverage() == 0) {
            return 0;
        }
        return 100 * (totalPassingPoints / points.size());
    }

    @Override
    public String toString() {
        if (passingAverage() == 0) {
            return "Point average (all): " + pointAverage() + "\n" + "Point average (passing):- "
                    + "\n" + "Pass percentage: 0.0";
        }
        return "Point average (all): " + pointAverage() + "\n" + "Point average (passing): " + passingAverage()
                + "\n" + "Pass percentage: " + percentageAverage();
    }
}