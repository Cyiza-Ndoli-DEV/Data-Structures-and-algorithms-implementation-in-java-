package linkedLists;

public class Node_Insert_in_the_middle{
    String data;
    Node next = null;

    public Node_Insert_in_the_middle(String data) {
        this.data = data;
    }

    public static void printNode(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" ==> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void insertNodeAfter(Node previousNode, String newData) {
        if (previousNode == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = previousNode.next;
        previousNode.next = newNode;
    }

    public static void main(String[] args) {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        printNode(nodeA);

        // Insert a new node with data "E" after nodeC
        insertNodeAfter(nodeB, "E");

        // Print the updated linked list
        printNode(nodeA);
    }
}
