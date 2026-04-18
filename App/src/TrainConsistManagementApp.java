class TrainConsistSorter {

    // Bubble Sort Method
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (capacities[j] > capacities[j + 1]) {
                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }

    // Utility to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Main Method
    public static void main(String[] args) {

        // Example input
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.print("Before Sorting: ");
        printArray(capacities);

        bubbleSort(capacities);

        System.out.print("After Sorting: ");
        printArray(capacities);
    }
}