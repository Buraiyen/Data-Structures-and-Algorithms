package ds.circularlinkedlist;

public class CircularDriver {
    public static void main(String[] args) {
        CircularLinkedList cl = new CircularLinkedList();
        cl.insertFirst(4);
        cl.insertFirst(100);
        cl.insertLast(13);
        cl.insertFirst(1193);
        cl.insertFirst(314);

        // Expected output: [314, 1193, 100, 4, 13]
        cl.displayList();

        cl.deleteFirst();

        // Expected output: [1193, 100, 4, 13]
        cl.displayList();

        CircularLinkedList cl2 = new CircularLinkedList();

        // Should have an error
        cl2.deleteFirst();
    }
}
