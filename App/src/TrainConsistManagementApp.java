import java.util.Arrays;

public class TrainConsistSorter {

    public static void main(String[] args) {

        // Step 1: Create array of bogie names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        // Before sorting
        System.out.println("Before Sorting: " + Arrays.toString(bogieNames));

        // Step 2: Sort using built-in method
        Arrays.sort(bogieNames);

        // After sorting
        System.out.println("After Sorting: " + Arrays.toString(bogieNames));
    }
}