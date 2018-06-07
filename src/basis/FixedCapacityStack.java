package basis;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStack<Item> {
    private int N;
    private Item[] a;
    public FixedCapacityStack(int cap)
    {
        a = (Item[]) new Object[cap];
        N=0;
    }
    void push(Item item)
    {
        a[N++] = item;
    }
    Item pop()
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
