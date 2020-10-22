package ds.BST;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
                BST tree=new BST();
				
				  tree.insert(17,"Seventeen"); tree.insert(1, "one"); tree.insert(4, "four");
				  tree.insert(24,"twentyFour"); tree.insert(25,"twentyFive");
				  tree.insert(29,"twentyNine"); tree.insert(98, "NintyEight"); tree.insert(99,
				  "NintyNine");
				 
                //tree.insert(1," ");tree.insert(2," ");tree.insert(3," ");tree.insert(4," ");tree.insert(5," ");tree.insert(6," ");tree.insert(7," ");tree.insert(8," ");tree.insert(9," ");tree.insert(10," ");
                
                //System.out.println("MaX NUMBER IN TREE IS -->   "+tree.findMax().name+"( "+tree.findMax().key+" )");
               // System.out.println("Min NUMBER IN TREE IS -->   "+tree.findMin().name+"( "+tree.findMin().key+" )");
                
                //System.out.println("deletion   -- >  " + tree.removeNode(1));
                System.out.println();
                System.out.println("Min NUMBER IN TREE IS -->   "+tree.findMin().name+"( "+tree.findMin().key+" )");
                System.out.print("Inorder ==>  ");
                ArrayList<Integer> in=tree.inOrderTraversal(tree.root);
                for(int i:in) {
                	System.out.println(i);
                }
                System.out.println();
                System.out.print("PreOrder ==>  ");tree.preOrderTraversal(tree.root);
                
                
                
	}
}
