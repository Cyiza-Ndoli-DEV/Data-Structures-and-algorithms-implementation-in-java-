package linkedLists;

public class Node_Search_Element {
    String data;
    Node_Search_Element next = null;

    public Node_Search_Element(String data) {
        this.data = data;
    }

    public static void printNode(Node_Search_Element head) {
        Node_Search_Element current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" ==> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static Node_Search_Element searchElement(Node_Search_Element head, String target) {
        Node_Search_Element current = head;
        while (current != null) {
            if (current.data.equals(target)) {
                return current; // Found the element
            }
            current = current.next;
        }
        return null; // Element not found
    }

    public static void main(String[] args) {
        Node_Search_Element linkedList = new Node_Search_Element("A");
        linkedList.next = new Node_Search_Element("B");
        linkedList.next.next = new Node_Search_Element("C");
        linkedList.next.next.next = new Node_Search_Element("D");

        System.out.println("Linked List:");
        printNode(linkedList);

        String target = "C";
        Node_Search_Element result = searchElement(linkedList, target);

        if (result != null) {
            System.out.println("Element '" + target + "' found in the list.");
        } else {
            System.out.println("Element '" + target + "' not found in the list.");
        }
    }
}
