import java.util.ArrayList;
import java.util.List;

class TrainConsistManagementApp {
    String type;   // e.g., Cylindrical, Rectangular
    String cargo;  // e.g., Petroleum, Coal, Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " bogie carrying " + cargo;
    }
}

public class SafetyComplianceApp {
    public static void main(String[] args) {

        // Prepare goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Grain"));

        System.out.println("Goods Bogies on Train:");
        goodsBogies.forEach(System.out::println);

        // Safety compliance check
        boolean isSafe = goodsBogies.stream()
                .allMatch(bogie -> {
                    // Cylindrical bogies must carry only Petroleum
                    if (bogie.type.equalsIgnoreCase("Cylindrical")) {
                        return bogie.cargo.equalsIgnoreCase("Petroleum");
                    }
                    // Other bogies can carry any cargo
                    return true;
                });

        // Display result
        if (isSafe) {
            System.out.println("\nTrain formation is SAFE for operation.");
        } else {
            System.out.println("\nTrain formation is UNSAFE! Check cargo assignments.");
        }
    }
}