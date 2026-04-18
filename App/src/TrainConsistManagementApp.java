public class TrainConsistSearchUC20 {

    // Search method with defensive check
    public static boolean searchBogie(String[] bogieIds, String key) {

        // ✅ Fail-Fast Validation
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Cannot perform search: No bogies available in the train.");
        }

        // Linear search (can be replaced with binary if needed)
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // ❌ Empty dataset
        String[] bogieIds = {};

        try {
            boolean result = searchBogie(bogieIds, "B102");

            if (result) {
                System.out.println("Bogie found.");
            } else {
                System.out.println("Bogie not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // ✅ Program continues
        System.out.println("Program continues safely...");
    }
}