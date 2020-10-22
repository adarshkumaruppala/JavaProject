package ds.BST;

import java.util.ArrayList;

public class BST {
	Node root;

	public void insert(int key, String string) {
		Node newNode=new Node(key,string);
		if(root == null) {
			root=newNode;
		}
		else {
			Node current=root;
			Node parent;
			while(true) {
				parent=current;
				if(key<current.key) {
					current=current.left;
					if(current==null) {
						parent.left=newNode;
						return;
					}
				}
				else {
					current=current.right;
					if(current==null) {
						parent.right=newNode;
						return;
					}
				}
			}
		}
		
	}
	public Node findMin() {
		Node current=root;
		Node last=null;
		while(current!=null) {
			last=current;
			current=current.left;
		}
		return last;
	}
	public Node findMax() {
		Node current=root;
		Node last=null;
		while(current!=null) {
			last=current;
			current=current.right;
		}
		return last;
	}
	
	public boolean removeNode(int key) {
		
		Node current=root;
		Node parent=root;
		boolean isLeft=false;
		while(current.key!=key) {
			parent=current;
			if(key<current.key) {
				isLeft=true;
				current=current.left;
			}
			else {
				current=current.right;
				isLeft=false;
			}
			if(current==null) return false;
		}
		// here after while loop we found the Node which we want to remove
		Node nodeToDelete=current;
		// if Node is leaf(having no children)
		if( nodeToDelete.left==null && nodeToDelete.right==null) {
			if(nodeToDelete==root) root=null;
			else if(isLeft) parent.left=null;
			else parent.right=null;
		}
		// if Node which we want remove having one child that is on left
		else if(nodeToDelete.right==null) {
			if(nodeToDelete ==root)root=nodeToDelete.left;
			else if(isLeft)parent.left=nodeToDelete.left;
			else parent.right=nodeToDelete.left;
		}
		// if Node which we want remove having one child that is on right
		else if(nodeToDelete.left==null) {
					if(nodeToDelete ==root)root=nodeToDelete.right;
					else if(isLeft)parent.left=nodeToDelete.right;
					else parent.right=nodeToDelete.right;
		}
		else {
			Node succesor=getSuccesor(nodeToDelete);
			if(nodeToDelete == root) {
				root=succesor;
			}
			else if(isLeft) {
				parent.left=succesor;
			}
			else {
				parent.right=succesor;
			}
			succesor.left=nodeToDelete.left;
			
		}
		
		return true;
		
	}
        private Node getSuccesor(Node nodeToDelete) {
        	Node sParent=nodeToDelete;
        	Node succesor=nodeToDelete;
        	Node current=nodeToDelete.right;
        	while(current!=null) {
        		sParent=succesor;
        		succesor=current;
        		current=current.left;
        		
        	}
        	if(succesor!=nodeToDelete.right) {
        		sParent.left=succesor.right;
        		succesor.right=nodeToDelete.right;
        	}
        	return succesor;
        			
        }
        public ArrayList<Integer> inOrderTraversal(Node node) {
        	ArrayList<Integer> inorde=new ArrayList<Integer>();
        	if(node==null)
        	    return null ;
        	else {
        			inOrderTraversal(node.left);
        			//System.out.print(node.key+" ");
        			inorde.add(node.key);
        			inOrderTraversal(node.right);
        	         }
        	//System.out.println(inorde);
        		return inorde;
           }
        public void preOrderTraversal(Node node) {
        	//System.out.println(node.key);
        	if(node==null)
        	    return ;
        			
        	System.out.print(node.key+" ");
        	preOrderTraversal(node.left);
      		preOrderTraversal(node.right);
      		
        		
           }
        

}













