package double_linkedLists;

public class Node_Insert_End_Double {
    String data;
    Node_Insert_End_Double next = null;
    Node_Insert_End_Double prev = null;

    public Node_Insert_End_Double(String data) {
        this.data = data;
    }

    public static void printNode(Node_Insert_End_Double head) {
        Node_Insert_End_Double current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" <==> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static Node_Insert_End_Double insertNodeAtEnd(Node_Insert_End_Double head, String newData) {
        Node_Insert_End_Double newNode = new Node_Insert_End_Double(newData);
        if (head == null) {
            return newNode;
        }
        Node_Insert_End_Double current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
        return head;
    }

    public static void main(String[] args) {
        Node_Insert_End_Double head = new Node_Insert_End_Double("A");
        head = insertNodeAtEnd(head, "B");
        head = insertNodeAtEnd(head, "C");

        printNode(head);
    }
}
