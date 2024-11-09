import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {

        int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };
        MainProgram.sort(numbers);
    }

    // returns the smallest number...
    public static int smallest(int[] array) {
        int currentNumber = array[0];
        for (int i : array) {
            if (currentNumber > i) {
                currentNumber = i;
            }
        }
        return currentNumber;
    }
    // Find the index of the Smallest number
    public static int indexOfSmallest(int[] array) {
        int number = 0;
        for (int i : array) {
            if (smallest(array) == i) {
                break;
            }
            number++;
        }
        return number;
    }

    // Find the indexOfSmallest starting from startIndex
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexNumber = startIndex;
        int currentNumber = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < currentNumber) {
                currentNumber = table[i];
                indexNumber = i;
            }
        }
        return indexNumber;
    }
    // Swap two desired index to each other
    public static void swap(int[] array, int index1, int index2) {
        int tempValue = array[index1];
        array[index1] = array[index2];
        array[index2] = tempValue;
    }
    // Sorts the array from lowest to highest number
    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int indexSmallZero = indexOfSmallestFrom(array, i);
            MainProgram.swap(array, indexSmallZero, i);
        }
    }
}
