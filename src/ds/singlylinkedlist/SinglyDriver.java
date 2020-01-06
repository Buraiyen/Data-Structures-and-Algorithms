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
        sl.displayList();
        sl.deleteFirst();
        sl.displayList();
        sl.deleteLast();
        sl.displayList();
    }
}
