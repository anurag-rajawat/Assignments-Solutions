public class P9 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        for (int row = n; row >= 1; row--) {
            int totalCols = 2 * row - 1;
            int totalSpaces = n - row;

            for (int spaces = 1; spaces <= totalSpaces; spaces++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
