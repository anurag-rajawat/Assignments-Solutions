package patterns;

public class P28 {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalCols = (row > n) ? 2 * n - row : row;
            int totalSpaces = n - totalCols;
            for (int space = 0; space < totalSpaces; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
