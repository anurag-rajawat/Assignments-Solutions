package patterns;

public class P7 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
            int totalCol = n - row + 1;
            for (int spaces = 1; spaces <= n - totalCol; spaces++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
