package ds.singlylinkedlist;

public class SinglyDriver {
    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.insertFirst(1);
        sl.insertFirst(2);
        sl.insertFirst(3);
        sl.insertFirst(4);
        sl.insertFirst(5);
        sl.insertLast(100);

        // Expected output: 5, 4, 3, 2, 1, 100
        sl.displayList();

        sl.deleteFirst();

        // Expected output: 4, 3, 2, 1, 100
        sl.displayList();

        sl.deleteLast();

        // Expected output: 4, 3, 2, 1
        sl.displayList();

        sl.deleteLast();

        // Expected output: 4, 3, 2
        sl.displayList();
    }
}
