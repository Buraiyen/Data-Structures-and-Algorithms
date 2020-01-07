package ds.singlylinkedlist;

public class SinglyLinkedList {

    private Node first;         // Represents the first node in the list
    private Node secondToLast;  // Represents the second-to-last node in the list. Used for deleting last node

    // Constructor
    public SinglyLinkedList(){}

    /**
     * Method to insert node at the beginning of the list
     *
     * @param data - value inside node
     */
    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    /**
     * Method to insert node at the end of the list
     *
     * @param data
     */
    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        Node current = first;
        while (current.next != null) { // Iterate to last element
            current = current.next;
        }
        current.next = newNode; // The node after the last node is now the last node
    }

    /**
     * Method to delete the first element in the list
     */

    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("ERROR: List is empty");
        }
        else {
            first = first.next; // The node after the old first is now the new first
        }
    }

    /**
     * Method to delete the last element in the list
     */
    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("ERROR: List is empty");
        }
        else {
            Node current = first;
            while (current.next != null) {
                secondToLast = current;
                current = current.next;
            }
            secondToLast.next = null; // The last element becomes null
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
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}
