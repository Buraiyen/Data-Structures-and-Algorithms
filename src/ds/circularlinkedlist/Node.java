package ds.circularlinkedlist;

public class Node {
    public int data;    // Numeric value inside of a node
    public Node next;   // Represents the next node in list


    /**
     * Function to display value in node
     */
    public void displayNode() {
        System.out.println("[ " + data + " ]");
    }
}
