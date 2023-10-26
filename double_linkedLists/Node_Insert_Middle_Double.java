package double_linkedLists;

public class Node_Insert_Middle_Double {
    String data;
    Node_Insert_Middle_Double next = null;
    Node_Insert_Middle_Double prev = null;

    public Node_Insert_Middle_Double(String data) {
        this.data = data;
    }

    public static void printNode(Node_Insert_Middle_Double head) {
        Node_Insert_Middle_Double current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" <==> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static Node_Insert_Middle_Double insertNodeInMiddle(Node_Insert_Middle_Double previousNode, String newData) {
        if (previousNode == null) {
            System.out.println("Previous node cannot be null.");
            return null;
        }
        Node_Insert_Middle_Double newNode = new Node_Insert_Middle_Double(newData);
        newNode.next = previousNode.next;
        newNode.prev = previousNode;
        previousNode.next = newNode;
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
        return newNode;
    }

    public static void main(String[] args) {
        Node_Insert_Middle_Double head = new Node_Insert_Middle_Double("A");
        Node_Insert_Middle_Double nodeB = new Node_Insert_Middle_Double("B");
        Node_Insert_Middle_Double nodeC = new Node_Insert_Middle_Double("C");
        Node_Insert_Middle_Double nodeD = new Node_Insert_Middle_Double("D");

        head.next = nodeB;
        nodeB.prev = head;
        nodeB.next = nodeC;
        nodeC.prev = nodeB;
        nodeC.next = nodeD;
        nodeD.prev = nodeC;

        printNode(head);

        // Insert a new node with data "E" after nodeC
        insertNodeInMiddle(nodeC, "E");

        // Print the updated linked list
        printNode(head);
    }
}

