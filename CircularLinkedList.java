package ds.circularLinkedList;

public class CircularLinkedList {
	public Node first;
	public Node last;
	public boolean isEmpty() {
		return first==null;
	}
	public void insertFirst(int data) {
		Node newNode=new Node();
		newNode.data=data;
		if(isEmpty()) {
			last=newNode;
		}
		newNode.next=first;
		first=newNode;
		
	}
	public void insertLast(int data) {
		Node newNode=new Node();
		newNode.data=data;
		if(isEmpty()) {
			first=newNode;
		}
		else {
			last.next=newNode;
			last=newNode;
		}
	}
	public Node deleteFirst() {
		Node tmp=first;
		if(first.next==null) {
			last=null;
		}
		first=first.next;
		return tmp;
	}
	
     public void displayList() {
    	 Node current=first;
    	 while(current!=null) {
    		 current.displayNode();
    		 current=current.next;
    	 }
    	 
     }
	
	
}
