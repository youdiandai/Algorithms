package basis;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

public class LinkListQueue<Item> implements Iterable<Item> {
    private class Node
    {
        Item item;
        Node next;
    }
    private Node first;
    private Node last;
    private int N;
    public boolean isEmpty()
    {
        return first==null;
    }
    public int size()
    {
        return N;
    }
    public void enqueue(Item item)
    {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty())first = last;
        else oldlast.next = last;
        N++;
    }
    public Item dequeue()
    {
        Item item = first.item;
        first = first.next;
        if(isEmpty())last = null;
        N--;
        return item;
    }
    public Iterator<Item> iterator(){return new LinkListQueueIterator();}
    public class LinkListQueueIterator implements Iterator<Item>
    {
        private Node current = first;
        public Item next()
        {
            Item item = current.item;
            current = current.next;
            return item;
        }
        public boolean hasNext() {
            return current !=null;
        }

    }

}
