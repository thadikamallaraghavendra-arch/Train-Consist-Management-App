public class TrainConsistApp {
    public static void main(String[] args) {

        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println(b1.getType() + " - " + b1.getCapacity());

            PassengerBogie b2 = new PassengerBogie("AC Chair", -10); // Exception

        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }

        try {
            PassengerBogie b3 = new PassengerBogie("First Class", 0); // Exception
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}