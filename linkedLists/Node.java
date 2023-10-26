package linkedLists;

public class Node {
    String data;
    Node next = null;
    
	public Node(String data) {
		this.data = data;
	
	}
	
	public static void printNode(Node s) {
		while (s.next !=null) {
			System.out.println(s.data + " ==> " + s.next.data);
			s = s.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Node nodeA = new Node("A");
         Node nodeB = new Node("B");
         Node nodeC = new Node("C");
         Node nodeD = new Node("D");
         
         
         nodeA.next = nodeB;
         nodeB.next = nodeC;
         nodeC.next = nodeD;
         printNode(nodeA);
	}

}
