package double_linkedLists;

public class Node_Insert_Front_Double {
    String data;
    Node_Insert_Front_Double next = null;
    Node_Insert_Front_Double prev = null;

    public Node_Insert_Front_Double(String data) {
        this.data = data;
    }

    public static void printNode(Node_Insert_Front_Double head) {
        Node_Insert_Front_Double current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" <==> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static Node_Insert_Front_Double insertNodeAtFront(Node_Insert_Front_Double head, String newData) {
        Node_Insert_Front_Double newNode = new Node_Insert_Front_Double(newData);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        return newNode;
    }

    public static void main(String[] args) {
        Node_Insert_Front_Double head = new Node_Insert_Front_Double("B");
        head = insertNodeAtFront(head, "A");
        head = insertNodeAtFront(head, "C");

        printNode(head);
    }
}
