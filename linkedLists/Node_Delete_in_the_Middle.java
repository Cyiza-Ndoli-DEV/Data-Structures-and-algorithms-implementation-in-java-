package linkedLists;

public class Node_Delete_in_the_Middle {
    String data;
    Node_Delete_in_the_Middle next = null;

    public Node_Delete_in_the_Middle(String data) {
        this.data = data;
    }

    public static void printNode(Node_Delete_in_the_Middle head) {
        Node_Delete_in_the_Middle current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" ==> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void deleteNodeInMiddle(Node_Delete_in_the_Middle previousNode) {
        if (previousNode == null || previousNode.next == null) {
            System.out.println("Node cannot be deleted. Invalid node specified.");
            return;
        }
        previousNode.next = previousNode.next.next;
    }

    public static void main(String[] args) {
        Node_Delete_in_the_Middle nodeA = new Node_Delete_in_the_Middle("A");
        Node_Delete_in_the_Middle nodeB = new Node_Delete_in_the_Middle("B");
        Node_Delete_in_the_Middle nodeC = new Node_Delete_in_the_Middle("C");
        Node_Delete_in_the_Middle nodeD = new Node_Delete_in_the_Middle("D");

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        printNode(nodeA);

        // Delete the node "C" in the middle
        deleteNodeInMiddle(nodeB);

        // Print the updated linked list
        printNode(nodeA);
    }
}
