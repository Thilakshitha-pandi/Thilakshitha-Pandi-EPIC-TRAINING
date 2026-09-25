class Node{
    Node prev;
    int data;
    Node next;
    
    Node(Node prev,int data,Node next){
        this.prev = prev;
        this.data=data;
        this.next = next;
    }
}
public class Main
{
	public static void main(String[] args) {
		Node obj1 = new Node(null,10,null);
		Node head = obj1;
		Node obj2 = new Node(obj1,20,null);
		obj1.next = obj2;
		Node obj3 = new Node(obj2,30,null);
		obj2.next = obj3;
		Node obj4 = new Node(obj3,40,null);
		obj3.next = obj4;
		
		Node temp = head;
		while (temp != null) {
		    System.out.println(temp.data);
		    temp = temp.next;
		}
	}
}


