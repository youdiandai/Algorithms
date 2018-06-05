package basis;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class VisualAccumulator {
    private double total;
    private int N;
    public VisualAccumulator(int trials,double max)
    {
        StdDraw.setXscale(0,trials);
        StdDraw.setYscale(0,max);
        StdDraw.setPenRadius(.005);

    }
    public  void addDataValue(double value)
    {
        this.total =this.total+value;
        N++;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N,value);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N,total/N);

    }
    public double mean()
    {
        return this.total/this.N;
    }
    public String toString()
    {
        return "Mean ("+N+" values):"+String.format("%7.5f",mean());
    }

    public static void main(String[] args)
    {
        int T = 10000;
        VisualAccumulator a = new VisualAccumulator(T,1.0);
        for(int t=0;t<T;t++)
        {
            a.addDataValue(StdRandom.random());

        }
        StdOut.println(a);
    }
}
