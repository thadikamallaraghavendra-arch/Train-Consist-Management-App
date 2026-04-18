public class TrainConsistSearch {

    // Linear Search Method
    public static boolean linearSearch(String[] bogieIds, String key) {

        for (int i = 0; i < bogieIds.length; i++) {

            if (bogieIds[i].equals(key)) {
                return true; // ✅ Found → Early stop
            }
        }

        return false; // ❌ Not found
    }

    public static void main(String[] args) {

        // Step 1: Unsorted bogie IDs
        String[] bogieIds = {"B102", "A215", "C309", "D450", "B678"};

        // Step 2: Search key
        String searchKey = "C309";

        // Step 3: Perform search
        boolean found = linearSearch(bogieIds, searchKey);

        // Step 4: Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " found.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found.");
        }
    }
}