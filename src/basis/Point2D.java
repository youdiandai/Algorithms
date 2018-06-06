package basis;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;


public class Point2D {
    private double x;
    private double y;
    public Point2D(double x,double Y)
    {
        this.x=x;
        this.y=y;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distance(Point2D that) {
        double dx = that.getX() - this.x;
        double dy = that.getY() - this.y;
        return Math.abs(dx * dx + dy * dy);
    }
    public void draw()
    {
        StdDraw.point(this.x,this.y);
    }

    public static void main(String[] args)
    {
        int N = 10000;

        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.setXscale(0,500);
        StdDraw.setYscale(0,500);
        StdDraw.setPenRadius(0.05);
        for(int i=0;i<N;i++)
        {
            double x = StdRandom.random();
            double y = StdRandom.random();
            Point2D point = new Point2D(x,y);
            point.draw();
        }


    }
}
