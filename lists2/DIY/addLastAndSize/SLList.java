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

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }    

    /** Retrieves the front item from the list. */
    public int getFirst() {
        return first.item;
    }

    public int getLast() {
        IntNode p = first;
        while(p.next != null) {
            p = p.next;
        }
        return p.item; 
    }
    /** addLast helper*/
    public void addLastHelper(IntNode p, int x) {
        if (p.next == null) {
            p.next = new IntNode(x,null);
        } else {
            addLastHelper(p.next, x);
        }
    }
    /** Adds an item to the end of the list. */
    public void addLast(int x) {
        /* Your Code Here! */
        addLastHelper(first, x);
    }

    /** Returns the number of items in the list using recursion. */
    public int size() {
        /* Your Code Here! */
        int nums = 0;
        IntNode p = first;
        while (p != null) {
            nums ++;
            p = p.next;
        }
        return nums;
    }
    public static void main (String[] args) {
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        System.out.println(L.size());
        System.out.println(L.getFirst());
        System.out.println(L.getLast());
    }

}
