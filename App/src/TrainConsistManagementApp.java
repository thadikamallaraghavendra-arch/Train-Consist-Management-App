import java.util.Arrays;

public class TrainConsistBinarySearch {

    // Binary Search Method
    public static boolean binarySearch(String[] bogieIds, String key) {

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                return true; // ✅ Found
            } else if (result < 0) {
                high = mid - 1; // search left
            } else {
                low = mid + 1; // search right
            }
        }

        return false; // ❌ Not found
    }

    public static void main(String[] args) {

        // Step 1: Sorted bogie IDs (IMPORTANT)
        String[] bogieIds = {"A215", "B102", "B678", "C309", "D450"};

        // (Optional safety) ensure sorted
        Arrays.sort(bogieIds);

        // Step 2: Search key
        String searchKey = "C309";

        // Step 3: Perform search
        boolean found = binarySearch(bogieIds, searchKey);

        // Step 4: Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " found.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found.");
        }
    }
}