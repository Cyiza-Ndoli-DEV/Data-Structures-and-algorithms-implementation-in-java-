package linkedLists;

public class Node_Delete_at_the_End {
    String data;
    Node_Delete_at_the_End next = null;

    public Node_Delete_at_the_End(String data) {
        this.data = data;
    }

    public static void printNode(Node_Delete_at_the_End head) {
        Node_Delete_at_the_End current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" ==> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static Node_Delete_at_the_End deleteNodeAtEnd(Node_Delete_at_the_End head) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return null;
        } else if (head.next == null) {
            return null; // If there is only one node, the list becomes empty
        }
        Node_Delete_at_the_End current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node_Delete_at_the_End nodeA = new Node_Delete_at_the_End("A");
        Node_Delete_at_the_End nodeB = new Node_Delete_at_the_End("B");
        Node_Delete_at_the_End nodeC = new Node_Delete_at_the_End("C");
        Node_Delete_at_the_End nodeD = new Node_Delete_at_the_End("D");

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        printNode(nodeA);

        // Delete the node at the end
        nodeA = deleteNodeAtEnd(nodeA);

        // Print the updated linked list
        printNode(nodeA);
    }
}
