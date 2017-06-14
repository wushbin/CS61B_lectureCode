public class SLList {
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode first;
    private int size;
    private IntNode sentinel; 

    public SLList() {
        first = null;
        sentinel = new IntNode(0, first);
        size = 0;
    }

    public SLList(int x) {
        first = new IntNode(x, null);
        sentinel = new IntNode(0, first);
        size = 1;
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
        sentinel.next = first;
        size += 1;
    }    

    /** Retrieves the front item from the list. */
    public int getFirst() {
        return first.item;
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    public int getLast() {
        IntNode p = first;
        while(p.next != null) {
            p = p.next;
        }
        return p.item; 
    }
    /** Adds an item to the end of the list. */
    public void addLast(int x) {
        size += 1;
        IntNode p = sentinel;
        /* Advance p to the end of the list. */
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    /** Crashes when you call addLast on an empty SLList. Fix it. */
    public static void main(String[] args) {
        SLList x = new SLList();
        x.addLast(5);
        x.addFirst(4);
        x.addFirst(3);
        x.addFirst(2);
        x.addFirst(1);
        x.addLast(6);
        System.out.println(x.getFirst());
        System.out.println(x.getLast());
        System.out.println(x.size);
    }
}
