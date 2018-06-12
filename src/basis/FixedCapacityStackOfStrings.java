package basis;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStackOfStrings {
    private int N;
    private String[] a;
    public FixedCapacityStackOfStrings(int cap)
    {
        a = new String[cap];
        N=0;
    }
    public boolean isFull()
    {
        return N==a.length;
    }
    void push(String item)
    {
        a[N++] = item;
    }
    String pop()
    {
        return a[--N];
    }
    boolean isEmpty()
    {
        return N ==0;
    }
    int size()
    {
        return N;
    }
    public static void main(String[] args)
    {
        FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(100);
        while (!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            if(!item.equals("-"))
            {
                s.push(item);
            }
            else if(!s.isEmpty()) StdOut.print(s.pop()+" ");
        }
        StdOut.println("("+s.size()+"left on stack");
    }
}
