package basis;

public class Practice {
    public static void IfEqual(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("equal");
        } else {
            System.out.println(("not equal"));
        }

    }

    public static void CheckDouble(double a) {
        if (a > 0 && a < 1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void main(String[] args) {
        IfEqual(1, 2, 3);
        IfEqual(1, 1, 1);
        CheckDouble(1.225);
        CheckDouble(0.12345);
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
