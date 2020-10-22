package ds.singleLinkedList;

public class SinglyLinkedList {
	private Node first;
	public boolean isEmpty() {
		return (first==null);
	}
	//used to insert at bigining
	public void insertFirst(int data) {
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=first;
		first=newNode;
		
	}
	public Node deleteFirst() {
		Node tmp=first;
		first=first.next;
		return tmp;
	}
	public void insertLast(int data) {
		Node current=first;
		while(current.next!=null) {
			current=current.next;
		}
		Node newNode=new Node();
		newNode.data=data;
		current.next=newNode;
	}
	public void insertAt(int index,int data) {
		if(index==0) {
			insertFirst(data);
		}
		else {
			Node n=first;
			Node node=new Node();
			node.next=null;node.data=data;
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			node.next=n.next;
			n.next=node;
		}
	}
	public Node deleteDuplicates() {
		Node cur=first;
		//int i=0;
		while(cur!=null && cur.next!=null) {
			if(cur.next.data==cur.data) {
				cur.next=cur.next.next;
				//System.out.println(++i+"  "+cur+ "    "+ cur.next + "  "+cur.data+"  "+cur.next.data);
			}
			else {
				cur=cur.next;
			}
			
		}return cur;
	}
	public Node reverseList() {
		Node t1=first;
		Node t2=t1.next;
		first.next=null;
		System.out.println(" t1  "  +t1+"  t2  "+t2+"  t2.next  " +t2.next);
		while(t1!=null && t2!=null) {
			Node tmp=t2.next;
			t2.next=t1;
			t1=t2;
			t2=tmp;
			
		}
		return t1;
	}
	public void deleteAt(int index) {
		if(index==0) first=first.next;
		else {
			Node n=first;
			Node n1=null;
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			n1=null;
			
		}
	}
	
	public void displayList() {
		System.out.println("List(fitst--> lats)");
		Node curent=first;
		while(curent!=null) {
			curent.displayNode();
			curent=curent.next;
		}
	}

}
