public class Main {
    public static void main(String[] args) {
        int I = 0;
        int J1 = 1;
        int J2 = 2;
        int J3 = 3;


        for (double i = 0; i <= 1.8; i += 0.2) {
            if (i == 0 || i == 1) {
                System.out.printf("I=%.0f", (I + i));
                System.out.printf(" J=%.0f\n", (J1 + i));

                System.out.printf("I=%.0f", (I + i));
                System.out.printf(" J=%.0f\n", (J2 + i));

                System.out.printf("I=%.0f", (I + i));
                System.out.printf(" J=%.0f\n", (J3 + i));
            } else {
                System.out.printf("I=%.1f", (I + i));
                System.out.printf(" J=%.1f\n", (J1 + i));

                System.out.printf("I=%.1f", (I + i));
                System.out.printf(" J=%.1f\n", (J2 + i));

                System.out.printf("I=%.1f", (I + i));
                System.out.printf(" J=%.1f\n", (J3 + i));
            }

        }
        System.out.print("I=2");
        System.out.print(" J=3\n");

        System.out.print("I=2");
        System.out.print(" J=4\n");

        System.out.print("I=2");
        System.out.print(" J=5\n");

    }
}
