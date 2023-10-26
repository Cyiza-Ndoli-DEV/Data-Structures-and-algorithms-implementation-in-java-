package linkedLists;

public class Node_Insert_at_the_Front {
    String data;
    Node_Insert_at_the_Front next = null;

    public Node_Insert_at_the_Front(String data) {
        this.data = data;
    }

    public static void printNode(Node_Insert_at_the_Front head) {
        Node_Insert_at_the_Front current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" ==> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static Node_Insert_at_the_Front insertNodeAtFront(Node_Insert_at_the_Front head, String newData) {
        Node_Insert_at_the_Front newNode = new Node_Insert_at_the_Front(newData);
        newNode.next = head;
        return newNode;
    }

    public static void main(String[] args) {
        Node_Insert_at_the_Front nodeA = new Node_Insert_at_the_Front("A");
        Node_Insert_at_the_Front nodeB = new Node_Insert_at_the_Front("B");
        Node_Insert_at_the_Front nodeC = new Node_Insert_at_the_Front("C");
        Node_Insert_at_the_Front nodeD = new Node_Insert_at_the_Front("D");

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        printNode(nodeA);

        // Insert a new node with data "E" at the front
        nodeA = insertNodeAtFront(nodeA, "E");

        // Print the updated linked list
        printNode(nodeA);
    }
}
