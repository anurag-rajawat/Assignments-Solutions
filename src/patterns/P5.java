package patterns;

public class P5 {
    public static void main(String[] args) {
        System.out.println("First way");
        pattern(5);
        System.out.println();
        System.out.println("Second way");
        pattern2(5);
    }

    // Method 1
    private static void pattern(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalCols = (row > n) ? 2 * n - row : row;
            for (int col = 0; col < totalCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method 2
    private static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
