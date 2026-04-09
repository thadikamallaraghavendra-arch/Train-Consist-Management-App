import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("=== Train Consist Input Validation ===");

        // Prompt user for Train ID
        System.out.print("Enter Train ID (Format TRN-1234): ");
        String trainID = scanner.nextLine();

        // Prompt user for Cargo Code
        System.out.print("Enter Cargo Code (Format PET-AB): ");
        String cargoCode = scanner.nextLine();

        // Define regex patterns
        String trainIDPattern = "TRN-\\d{4}";
        String cargoCodePattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern trainPattern = Pattern.compile(trainIDPattern);
        Pattern cargoPattern = Pattern.compile(cargoCodePattern);

        // Match input
        Matcher trainMatcher = trainPattern.matcher(trainID);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Validate Train ID
        if (trainMatcher.matches()) {
            System.out.println("Train ID is valid.");
        } else {
            System.out.println("Invalid Train ID format!");
        }

        // Validate Cargo Code
        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is valid.");
        } else {
            System.out.println("Invalid Cargo Code format!");
        }

        scanner.close();
    }
}