public class P12 {
    public static void main(String[] args) {
        pattern(5);
    }

    // Method 1
    private static void pattern(int n) {
        // For above pattern
        for (int row = n ; row >= 1; row--) {
            int spaces = n - row;
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            int totalSpaces = n - row;
            for (int space = 1; space <= totalSpaces; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // For below pattern

    }
}
