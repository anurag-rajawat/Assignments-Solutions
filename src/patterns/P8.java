package patterns;

public class P8 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            int totalCol = 2 * row - 1;
            int totalSpace = n - row;
            for (int space = 1; space <= totalSpace; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
