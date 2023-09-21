public class program1
{
    public static void main(String[] args) {
        int tableSize = 10;

        // Display the header row
        System.out.print("    |");
        for (int i = 1; i <= tableSize; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n-----------------------------------------");

        for (int i = 1; i <= tableSize; i++) {
            System.out.printf("%3d |", i);
            for (int j = 1; j <= tableSize; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
