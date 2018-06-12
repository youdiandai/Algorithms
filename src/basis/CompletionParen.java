package basis;

import edu.princeton.cs.algs4.StdOut;

public class CompletionParen {
    private static final char LEFT_PAREN     = '(';
    private static final char RIGHT_PAREN    = ')';
    public static String completion(String s)
    {
        LinkListQueue<Character> a = new LinkListQueue<Character>();
        LinkListQueue<Character> b = new LinkListQueue<Character>();
        LinkListQueue<Character> c = new LinkListQueue<Character>();
        for(int i=0;i<s.length();i++)
        {
            a.enqueue(s.charAt(i));
        }
        while (!a.isEmpty())
        {
            char x = a.dequeue();
            b.enqueue(x);
            if(x==RIGHT_PAREN)
            {
                c.enqueue(LEFT_PAREN);
                while (!b.isEmpty())
                {
                    c.enqueue(b.dequeue());
                }
                while (!c.isEmpty())
                {
                    b.enqueue(c.dequeue());
                }
            }
        }
        String sum="";
        for (Character x:b)
        {
            sum+=x;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        String s = "1+2)*3-4)*5-6)))";
        StdOut.println(completion(s));
    }
}
