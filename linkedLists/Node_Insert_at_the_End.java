package linkedLists;

public class Node_Insert_at_the_End {
    String data;
    Node_Insert_at_the_End next = null;

    public Node_Insert_at_the_End(String data) {
        this.data = data;
    }

    public static void printNode(Node_Insert_at_the_End head) {
        Node_Insert_at_the_End current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" ==> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void insertNodeAtEnd(Node_Insert_at_the_End head, String newData) {
        Node_Insert_at_the_End newNode = new Node_Insert_at_the_End(newData);
        if (head == null) {
            // If the list is empty, the new node becomes the head.
            head = newNode;
        } else {
            Node_Insert_at_the_End current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public static void main(String[] args) {
        Node_Insert_at_the_End nodeA = new Node_Insert_at_the_End("A");
        Node_Insert_at_the_End nodeB = new Node_Insert_at_the_End("B");
        Node_Insert_at_the_End nodeC = new Node_Insert_at_the_End("C");
        Node_Insert_at_the_End nodeD = new Node_Insert_at_the_End("D");

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        printNode(nodeA);

        // Insert a new node with data "E" at the end
        insertNodeAtEnd(nodeA, "E");

        // Print the updated linked list
        printNode(nodeA);
    }
}
