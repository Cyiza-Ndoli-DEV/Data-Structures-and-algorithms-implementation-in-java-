package double_linkedLists;

public class Node_Delete_Front_Double {
    String data;
    Node_Delete_Front_Double next = null;
    Node_Delete_Front_Double prev = null;

    public Node_Delete_Front_Double(String data) {
        this.data = data;
    }

    public static void printNode(Node_Delete_Front_Double head) {
        Node_Delete_Front_Double current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" <==> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static Node_Delete_Front_Double deleteNodeAtFront(Node_Delete_Front_Double head) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return null;
        }
        Node_Delete_Front_Double newHead = head.next;
        if (newHead != null) {
            newHead.prev = null;
        }
        return newHead;
    }

    public static void main(String[] args) {
        Node_Delete_Front_Double head = new Node_Delete_Front_Double("A");
        head = deleteNodeAtFront(head);

        printNode(head);
    }
}
