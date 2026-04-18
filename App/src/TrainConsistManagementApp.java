public class TrainConsistApp {

    public static void main(String[] args) {

        // ✅ Safe Case
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");

        // ❌ Unsafe Case
        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");

        // ✅ Program continues
        GoodsBogie b3 = new GoodsBogie("Rectangular");
        b3.assignCargo("Food");

        System.out.println("Program continues successfully...");
    }
}