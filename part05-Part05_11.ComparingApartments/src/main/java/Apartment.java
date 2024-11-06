
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int currentPrice = this.squares * this.princePerSquare;
        int comparedPrice = compared.squares * compared.princePerSquare;

        int priceValue = currentPrice - comparedPrice;

        if (priceValue < 0) {
            return priceValue * -1;
        }
        return priceValue;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.princePerSquare > compared.princePerSquare) {
            return true;
        }
        return false;
    }

}
