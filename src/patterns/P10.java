package patterns;

public class P10 {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            int totalSpaces = n - row;
            for (int space = 1; space <= totalSpaces; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
