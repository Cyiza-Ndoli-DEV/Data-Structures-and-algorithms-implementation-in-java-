package double_linkedLists;

public class Node_Delete_Middle_Double {
    String data;
    Node_Delete_Middle_Double next = null;
    Node_Delete_Middle_Double prev = null;

    public Node_Delete_Middle_Double(String data) {
        this.data = data;
    }

    public static void printNode(Node_Delete_Middle_Double head) {
        Node_Delete_Middle_Double current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" <==> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void deleteNodeInMiddle(Node_Delete_Middle_Double nodeToDelete) {
        if (nodeToDelete == null || nodeToDelete.prev == null || nodeToDelete.next == null) {
            System.out.println("Node cannot be deleted. Invalid node specified.");
            return;
        }
        nodeToDelete.prev.next = nodeToDelete.next;
        nodeToDelete.next.prev = nodeToDelete.prev;
    }

    public static void main(String[] args) {
        Node_Delete_Middle_Double head = new Node_Delete_Middle_Double("A");
        Node_Delete_Middle_Double nodeB = new Node_Delete_Middle_Double("B");
        Node_Delete_Middle_Double nodeC = new Node_Delete_Middle_Double("C");
        Node_Delete_Middle_Double nodeD = new Node_Delete_Middle_Double("D");

        head.next = nodeB;
        nodeB.prev = head;
        nodeB.next = nodeC;
        nodeC.prev = nodeB;
        nodeC.next = nodeD;
        nodeD.prev = nodeC;

        printNode(head);

        // Delete node "C" in the middle
        deleteNodeInMiddle(nodeC);

        // Print the updated linked list
        printNode(head);
    }
}

