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
        newNode.next = first; // The former 'first' node is now second-to-first
        first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty()) {
            first = newNode;
        }
        else {
            last.next = newNode;
            last = newNode;
        }
    }

    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("ERROR: List is empty");
        }
        else {
            if (first.next == null) {
                last = null;
            }
            first = first.next;
        }
    }

    public boolean isEmpty() {
        return (first == null);
    }

    /**
     * Displays all nodes in the list
     */
    public void displayList() {
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}
