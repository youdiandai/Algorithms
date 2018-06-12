package basis;

import edu.princeton.cs.algs4.StdOut;

public class CompletionParen {
    private static final String LEFT_PAREN     = "(";
    private static final String RIGHT_PAREN    = ")";
    public static String completion(String s)
    {
        String[] ss = s.split(" ");
        for(int i=0;i<ss.length;i++)
        {
            StdOut.print(ss[i]);
        }
        StdOut.println();
        LinkListStack<String> val = new LinkListStack<String>();
        LinkListStack<String> opt = new LinkListStack<String>();
        for(int i=0;i<ss.length;i++)
        {
            if(!ss[i].equals(RIGHT_PAREN))
            {
                if(ss[i].equals("+")||ss[i].equals("-")||ss[i].equals("*")||ss[i].equals("/"))
                {
                    opt.push(ss[i]);
                }
                else
                {
                    val.push(ss[i]);
                }
            }
            else
            {
                String temps=RIGHT_PAREN;
                temps=val.pop()+temps;
                temps=opt.pop()+temps;
                temps=val.pop()+temps;
                temps=LEFT_PAREN+temps;
                val.push(temps);
            }
        }
        return val.pop();
    }
    public static void main(String[] args)
    {
        String s = "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
        StdOut.println(completion(s));
    }
}
