package basis;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
//copy from https://algs4.cs.princeton.edu/13stacks/Parentheses.java.html

public class Parentheses {
    private static final char LEFT_PAREN     = '(';
    private static final char RIGHT_PAREN    = ')';
    private static final char LEFT_BRACE     = '{';
    private static final char RIGHT_BRACE    = '}';
    private static final char LEFT_BRACKET   = '[';
    private static final char RIGHT_BRACKET  = ']';

    public static boolean isBalanced(String s) {
        LinkListStack<Character> LinkListStack = new LinkListStack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == LEFT_PAREN)   LinkListStack.push(LEFT_PAREN);
            if (s.charAt(i) == LEFT_BRACE)   LinkListStack.push(LEFT_BRACE);
            if (s.charAt(i) == LEFT_BRACKET) LinkListStack.push(LEFT_BRACKET);

            if (s.charAt(i) == RIGHT_PAREN) {
                if (LinkListStack.isEmpty())           return false;
                if (LinkListStack.pop() != LEFT_PAREN) return false;
            }

            else if (s.charAt(i) == RIGHT_BRACE) {
                if (LinkListStack.isEmpty())           return false;
                if (LinkListStack.pop() != LEFT_BRACE) return false;
            }

            else if (s.charAt(i) == RIGHT_BRACKET) {
                if (LinkListStack.isEmpty())             return false;
                if (LinkListStack.pop() != LEFT_BRACKET) return false;
            }
        }
        return LinkListStack.isEmpty();
    }


    public static void main(String[] args) {
        String s = StdIn.readString();
        StdOut.println(isBalanced(s));
    }
}
