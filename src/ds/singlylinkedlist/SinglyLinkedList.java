package ds.singlylinkedlist;

public class SinglyLinkedList {

    private Node first; // Represents the first node in the list

    // Constructor
    public SinglyLinkedList(){}

    /**
     * Function to inset node at the beginning of the list
     *
     * @param data - value inside node
     */
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            first = newNode;
        }
        else {
            newNode.next = first;
            first = newNode;
        }

    }

    /**
     * Function to check if the linked list is empty
     *
     * @return true if linked list is empty; false if not
     */
    public boolean isEmpty() {
        return (first == null);
    }

    /**
     * Displays all nodes in the list
     */
    public void displayList() {
        Node current = first;
        while (current.next != null) {
            current.displayNode();
            current = current.next;
        }
    }
}
