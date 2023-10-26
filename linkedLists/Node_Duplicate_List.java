package linkedLists;

public class Node_Duplicate_List {
    String data;
    Node_Duplicate_List next = null;

    public Node_Duplicate_List(String data) {
        this.data = data;
    }

    public static void printNode(Node_Duplicate_List head) {
        Node_Duplicate_List current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" ==> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static Node_Duplicate_List duplicateList(Node_Duplicate_List originalHead) {
        Node_Duplicate_List originalCurrent = originalHead;
        Node_Duplicate_List newHead = null;
        Node_Duplicate_List newCurrent = null;

        while (originalCurrent != null) {
            Node_Duplicate_List newNode = new Node_Duplicate_List(originalCurrent.data);

            if (newHead == null) {
                newHead = newNode;
                newCurrent = newHead;
            } else {
                newCurrent.next = newNode;
                newCurrent = newCurrent.next;
            }

            originalCurrent = originalCurrent.next;
        }

        return newHead;
    }

    public static void main(String[] args) {
        Node_Duplicate_List originalList = new Node_Duplicate_List("A");
        originalList.next = new Node_Duplicate_List("B");
        originalList.next.next = new Node_Duplicate_List("C");
        originalList.next.next.next = new Node_Duplicate_List("D");

        System.out.println("Original List:");
        printNode(originalList);

        Node_Duplicate_List duplicateList = duplicateList(originalList);

        System.out.println("Duplicate List:");
        printNode(duplicateList);
    }
}
