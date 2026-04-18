import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistPerformance {

    public static void main(String[] args) {

        // Step 1: Create dataset
        List<Bogie> bogies = generateBogies(100000); // large dataset

        // -------------------------------
        // LOOP-BASED FILTERING
        // -------------------------------
        long startLoop = System.nanoTime();

        List<Bogie> loopResult = filterUsingLoop(bogies);

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // -------------------------------
        // STREAM-BASED FILTERING
        // -------------------------------
        long startStream = System.nanoTime();

        List<Bogie> streamResult = filterUsingStream(bogies);

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // -------------------------------
        // OUTPUT RESULTS
        // -------------------------------
        System.out.println("Loop Result Count: " + loopResult.size());
        System.out.println("Stream Result Count: " + streamResult.size());

        System.out.println("Loop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);

        // Verify both results match
        System.out.println("Results Match: " + (loopResult.size() == streamResult.size()));
    }

    // -------------------------------
    // LOOP METHOD
    // -------------------------------
    public static List<Bogie> filterUsingLoop(List<Bogie> bogies) {
        List<Bogie> result = new ArrayList<>();

        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                result.add(b);
            }
        }
        return result;
    }

    // -------------------------------
    // STREAM METHOD
    // -------------------------------
    public static List<Bogie> filterUsingStream(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
    }

    // -------------------------------
    // DATA GENERATOR
    // -------------------------------
    public static List<Bogie> generateBogies(int size) {
        List<Bogie> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int capacity = 30 + random.nextInt(100); // 30 to 130
            list.add(new Bogie("Passenger", capacity));
        }

        return list;
    }
}