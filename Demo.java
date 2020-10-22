package ds.singleLinkedList;

public class Demo {

	public static void main(String[] args) {
            Node obj1=new Node();
            obj1.data=23;
            Node obj2=new Node();
            obj2.data=34;
            Node obj3=new Node();
            obj3.data=45;
            obj1.next=obj2;
            obj2.next=obj3;
            System.out.println(obj1.next==obj2);
            System.out.println(obj1+ " "+ obj2+" "+obj3);
            
            SinglyLinkedList mylist=new SinglyLinkedList();
            mylist.insertFirst(1);
            mylist.insertFirst(12);
            mylist.insertFirst(12);
            mylist.insertFirst(13);
            mylist.insertFirst(13);
            mylist.insertAt(3, 1000);
            mylist.insertFirst(13);
            mylist.insertFirst(13);
            mylist.insertFirst(10);
            mylist.deleteFirst();
            mylist.insertLast(100);
            mylist.insertLast(100);
           // mylist.deleteDuplicates();
            mylist.displayList(); 
            System.out.println(" after deleting");
            mylist.deleteAt(2);
           // mylist.reverseList();
            
           mylist.displayList();       
	}

}
