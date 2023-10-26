package linkedLists;

public class Node_Merge_Lists {
    String data;
    Node_Merge_Lists next = null;

    public Node_Merge_Lists(String data) {
        this.data = data;
    }

    public static void printNode(Node_Merge_Lists head) {
        Node_Merge_Lists current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" ==> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static Node_Merge_Lists mergeLists(Node_Merge_Lists list1, Node_Merge_Lists list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        Node_Merge_Lists mergedHead = list1;

        while (list1.next != null) {
            list1 = list1.next;
        }

        list1.next = list2;

        return mergedHead;
    }

    public static void main(String[] args) {
        Node_Merge_Lists list1 = new Node_Merge_Lists("A");
        list1.next = new Node_Merge_Lists("B");
        list1.next.next = new Node_Merge_Lists("C");

        Node_Merge_Lists list2 = new Node_Merge_Lists("D");
        list2.next = new Node_Merge_Lists("E");
        list2.next.next = new Node_Merge_Lists("F");

        System.out.println("List 1:");
        printNode(list1);

        System.out.println("List 2:");
        printNode(list2);

        Node_Merge_Lists mergedList = mergeLists(list1, list2);

        System.out.println("Merged List:");
        printNode(mergedList);
    }
}
