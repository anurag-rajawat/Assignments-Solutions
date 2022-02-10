public class P11 {
    public static void main(String[] args) {
        pattern(5);
    }

    private static void pattern(int n) {
        for (int row = n; row >=1; row--) {
            int spaces  = n -row;
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
