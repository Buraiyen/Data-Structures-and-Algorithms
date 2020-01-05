package ds.singlylinkedlist;

public class SinglyLinkedList {

    private Node first; // Represents the first node in the list



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
