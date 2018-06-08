package basis;
import java.util.Iterator;
public class LinkListStack<Item> implements Iterable<Item>{
    class Node
    {
        Item item;
        Node next;

    }
    private int N;
    private Node first = new Node();
    public boolean isEmpty(){return N==0;}
    public int size(){return N;}
    public void push(Item item)
    {
        Node oldfirst = this.first;
        this.first = new Node();
        this.first.item = item;
        this.first.next = oldfirst;
        N++;
    }
    public Item pop()
    {
        Item a;
        a = this.first.item;
        this.first = this.first.next;
        N--;
        return a;
    }
    public Iterator<Item> iterator(){return  new LinkListStackIterator();}
    public class LinkListStackIterator implements Iterator<Item>
    {
        private Node current = first;
        public boolean hasNext(){ return current !=null}
        public Item next()
        {
            Item item = current.item;
            current = current.next;
            return item;
        }
        public void remove(){}
    }
}
