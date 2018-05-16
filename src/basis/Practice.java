package basis;

import edu.princeton.cs.algs4.StdDraw;

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

//    public static double binomial(int N, int k, double p) {
//        if (N == 0 && k == 0) return 1.0;
//        if (N < 0 || k < 0) return 0.0;
//        return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
//    }

    public static void main(String[] args) {
        int N=100;
        StdDraw.setXscale(0,N);
        StdDraw.setYscale(0,N*N);
        StdDraw.setPenRadius(.01);
        for (int i=1;i<=N;i++)
        {
            StdDraw.point(i,i);
            StdDraw.point(i,i*i);
            StdDraw.point(i,i*Math.log(i));
        }
    }
}
