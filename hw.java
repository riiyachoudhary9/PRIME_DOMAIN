public class hw {

    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < (n - i) * 2; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i - 1; j++) {

                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("!");
                }

                if (j < 2 * i - 2) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}