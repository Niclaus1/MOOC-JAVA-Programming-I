import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<String> texts = new ArrayList<>();

        int[] array = { 3, 1, 5, 99, 3, 12 };
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        integers.add(8);
        integers.add(3);
        integers.add(7);
        System.out.println(integers);

        String[] arrays = { "practice.geeksforgeeks.org",
                "www.geeksforgeeks.org",
                "code.geeksforgeeks.org" };
        System.out.println(Arrays.toString(arrays));
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
