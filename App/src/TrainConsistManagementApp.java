import java.util.ArrayList;
import java.util.List;

// Reusing Bogie class
class TrainConsistManagementApp {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie: " + name + " | Capacity: " + capacity;
    }
}

public class TrainApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));

        // Stream pipeline: map + reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)        // Extract capacity
                .reduce(0, Integer::sum);    // Aggregate (sum)

        // Display result
        System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);

        // Show original list remains unchanged
        System.out.println("\nOriginal Bogie List:");
        bogies.forEach(System.out::println);

        // Program continues...
    }
}