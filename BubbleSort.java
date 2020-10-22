package Sortings;

public class BubbleSort {

	public static void main(String[] args) {
              int[] arr=new int[]{10,2,21,3,4,14,4,13};
              bubbleSort(arr);
              System.out.println("AFTER BUBBLE SORT ");
              for(int i=0;i<arr.length;i++)System.out.print(arr[i]+" ");
              bubbleSort2(arr);
              System.out.println("\n AFTER BUBBLE SORT ");
              for(int i=0;i<arr.length;i++)System.out.print(arr[i]+" ");
              insertionSort(arr);
              System.out.println("\n AFTER Insertion SORT ");
              for(int i=0;i<arr.length;i++)System.out.print(arr[i]+" ");
              
              
	}

	private static int[] insertionSort(int[] arr) {
		      int countForLoop=0;
		      int WhileLoop=0;
             int n=arr.length;
             for(int i=1;i<n-1;i++) {
            	 int value=arr[i];
            	 int key=i;
            	 countForLoop++;
            	 while(key>0 && arr[key-1]>value) {
            		 WhileLoop++;
            		 arr[key]=arr[key-1];
            		 key--;
            		 
            	 }
            	 arr[key]=value;
             }
             System.out.println("\n  For loop Iterations "+ countForLoop+ " \n while Loop Iteations "+WhileLoop );
             return arr;
	}

	private static int[] bubbleSort2(int[] arr) {
		int n=arr.length;
		int countI=0;
		int countJ=0;
		for(int i=0;i<n-1;i++) {
			countI++;
			boolean swapped=false;  // this condn is used to stop iterations after sorting completed
			for(int j=0;j<n-i-1;j++) {// no of inner and outer for loop iteration will be reduced..
			     countJ++;
				if(arr[j]>arr[j+1]) {  // time complexity  O(n2)
					
					
					int tmp=arr[j];
					arr[j]=arr[j+1];  // suggest O(1) time complexity..on sortings..
					arr[j+1]=tmp;
					swapped=true;
				}
			}
			if(swapped==false)break;
		}
		System.out.println("\n Outer For loop Iteraations "+countI+"\n"+" Inner For Loop Itertions "+countJ);
		return arr;
		
		
	}

	public static int[] bubbleSort(int[] arr) { // this bubble Sort is normal of O(n2) time complexity ;
		int n=arr.length;
		int countI=0;
		int countJ=0;
		for(int i=0;i<n-1;i++) {
			countI++;
			for(int j=0;j<n-i-1;j++) {
			     countJ++;
				if(arr[j]>arr[j+1]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		System.out.println(" Outer For loop Iteraations "+countI+"\n"+" Inner For Loop Itertions "+countJ);
		return arr;
		
	}
   
	
	
}
