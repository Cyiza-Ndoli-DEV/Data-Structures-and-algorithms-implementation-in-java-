package double_linkedLists;

public class Node_Search_Element_Double {
    String data;
    Node_Search_Element_Double next = null;
    Node_Search_Element_Double prev = null;

    public Node_Search_Element_Double(String data) {
        this.data = data;
    }

    public static void printNode(Node_Search_Element_Double head) {
        Node_Search_Element_Double current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" <==> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static Node_Search_Element_Double searchElement(Node_Search_Element_Double head, String target) {
        Node_Search_Element_Double current = head;
        while (current != null) {
            if (current.data.equals(target)) {
                return current; // Found the element
            }
            current = current.next;
        }
        return null; // Element not found
    }

    public static void main(String[] args) {
        Node_Search_Element_Double linkedList = new Node_Search_Element_Double("A");
        linkedList.next = new Node_Search_Element_Double("B");
        linkedList.next.prev = linkedList;
        linkedList.next.next = new Node_Search_Element_Double("C");
        linkedList.next.next.prev = linkedList.next;
        linkedList.next.next.next = new Node_Search_Element_Double("D");
        linkedList.next.next.next.prev = linkedList.next.next;

        System.out.println("Doubly Linked List:");
        printNode(linkedList);

        String target = "C";
        Node_Search_Element_Double result = searchElement(linkedList, target);

        if (result != null) {
            System.out.println("Element '" + target + "' found in the list.");
        } else {
            System.out.println("Element '" + target + "' not found in the list.");
        }
    }
}
