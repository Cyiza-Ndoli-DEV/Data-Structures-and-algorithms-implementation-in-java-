package linkedLists;

public class Node_Delete_at_the_Front {
    String data;
    Node_Delete_at_the_Front next = null;

    public Node_Delete_at_the_Front(String data) {
        this.data = data;
    }

    public static void printNode(Node_Delete_at_the_Front head) {
        Node_Delete_at_the_Front current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" ==> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static Node_Delete_at_the_Front deleteNodeAtFront(Node_Delete_at_the_Front head) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return null;
        }
        return head.next;
    }

    public static void main(String[] args) {
        Node_Delete_at_the_Front nodeA = new Node_Delete_at_the_Front("A");
        Node_Delete_at_the_Front nodeB = new Node_Delete_at_the_Front("B");
        Node_Delete_at_the_Front nodeC = new Node_Delete_at_the_Front("C");
        Node_Delete_at_the_Front nodeD = new Node_Delete_at_the_Front("D");

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        printNode(nodeA);

        // Delete the node at the front
        nodeA = deleteNodeAtFront(nodeA);

        // Print the updated linked list
        printNode(nodeA);
    }
}
