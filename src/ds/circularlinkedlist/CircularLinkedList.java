package ds.circularlinkedlist;

public class CircularLinkedList {
    private Node first, last;

    public CircularLinkedList() {
        first = null;
        last = null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public boolean isEmpty() {
        return (first == null);
    }
}
