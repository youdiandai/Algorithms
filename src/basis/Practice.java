package basis;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

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
        int SIDES = 6;
        double[] dist = new double[2*SIDES+1];
        for (int i=1;i<=SIDES;i++)
        {
            for (int j=1;j<=SIDES;j++)
            {
                dist[i+j]+=1.0;
            }
        }
        for (int k =2;k<=2*SIDES;k++)
        {
            dist[k]/=36;
        }
        for (int l=0;l<dist.length;l++)
        {
            StdOut.print(dist[l]+" ");
        }
    }
}
