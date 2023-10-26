package double_linkedLists;

public class Node_Delete_End_Double {
    String data;
    Node_Delete_End_Double next = null;
    Node_Delete_End_Double prev = null;

    public Node_Delete_End_Double(String data) {
        this.data = data;
    }

    public static void printNode(Node_Delete_End_Double head) {
        Node_Delete_End_Double current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" <==> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static Node_Delete_End_Double deleteNodeAtEnd(Node_Delete_End_Double head) {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
            return null;
        }
        if (head.next == null) {
            return null; // If there is only one node, the list becomes empty
        }
        Node_Delete_End_Double current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return head;
    }

    public static void main(String[] args) {
        Node_Delete_End_Double head = new Node_Delete_End_Double("A");
        head = deleteNodeAtEnd(head);

        printNode(head);
    }
}
