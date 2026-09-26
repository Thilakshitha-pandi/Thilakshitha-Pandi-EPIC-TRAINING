import java.util.*;
class Node{
    Node prev;
    int data;
    Node next;
    Node head = null;
	Node tail = null;
	
    Node(Node prev,int data,Node next){
        this.prev = prev;
        this.data=data;
        this.next = next;
    }
    
    Node(){
        
    }
    
    void insertData(Scanner in){
        int n = in.nextInt();
	    for(int i = 0 ; i<n ; i++ ){
	        int val = in.nextInt();
	        Node obj = new Node(null,val,null);
	        if(head==null){
                head = obj;
                tail=obj;
            }
            else{
                tail.next = obj;
                obj.prev = tail;
                tail = obj;
            }
	    }
    }
    
    void displayData(){
        Node temp = head;
		while (temp != null) {
		    System.out.println(temp.data);
		    temp = temp.next;
		}
    }
    
    void revDisplay(Node temp){
        if (temp == null){
            return;
        }
        revDisplay(temp.next);
        System.out.println(temp.data);
    }
    
    void insertFront(Scanner in){
        System.out.println("Enter value: ");
        int val = in.nextInt();
        Node obj = new Node(null,val,null);
        if(head == null){
            head = obj;
            tail = obj;
        }
        else{
            obj.next = head;
            head.prev = obj;
            head = obj;
        }
    }
    
    void insertMiddle(Scanner in){
        System.out.println("Enter the position: ");
        int n = in.nextInt();
        System.out.println("Enter the value: ");
        int val = in.nextInt();
        Node obj = new Node(null,val, null);
        Node temp = head;
        for(int i=0; i<n-2; i++){
            temp = temp.next;
        }
        obj.next = temp.next;
        obj.prev = temp;
        temp.next.prev = obj;
        temp.next = obj;
    }
    
    void insertEnd(Scanner in){
        System.out.println("Enter value:");
        int val = in.nextInt();
        Node newNode = new Node(null, val, null);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    
    void deleteFront(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if(head == null) {
            tail = null;
        }
        else {
            head.prev = null;
        }
    }
    
    void deleteMiddle(Scanner in){
        System.out.println("Enter the position: ");
        int n = in.nextInt();
        Node temp = head;
        for(int i=0; i<n-1; i++){
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }
    
    void deleteEnd(){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        tail = tail.prev;
        if(tail == null) {
            head = null;
        }
        else {
            tail.next = null;
        }
    }
    
}
public class Main   
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    Node node = new Node();
	    while(true){
	        System.out.print("\n1)Insert Data \n2)Display Data \n3)Insert Front \n4)Insert Middle \n5)Insert End \n6)Delete Front \n7)Delete Middle \n8)Delete End \n9)Reverse Display");
	        int n = in.nextInt();
	        switch(n){
		        case 1:{
		            node.insertData(in);
		            break;
		        }
		        case 2:{
		            node.displayData();
		            break;
		        }
		        case 3:{
		            node.insertFront(in);
		            break;
		        }
		        case 4:{
		            node.insertMiddle(in);
		            break;
		        }case 5:{
		            node.insertEnd(in);
		            break;
		        }
		        case 6:{
		            node.deleteFront();
		            break;
		        }
		        case 7:{
		            node.deleteMiddle(in);
		            break;
		        }
		        case 8:{
		            node.deleteEnd();
		            break;
		        }
		        case 9:{
		            node.revDisplay(node.head);
		            break;
		        }
		        default: 
		            System.out.println("invalid");
		    }
	    }
	}
}


