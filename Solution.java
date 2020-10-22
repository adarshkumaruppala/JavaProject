package java1.epam;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int a1[]= {1,2,2,1,2,3,3,7};
		int a2[]= {1,4,-1,3,2};
		System.out.println(findLength(a2));
		int B[]=solution(a,9);
		for(int b:B)System.out.print(b+" ");
		System.out.println();
		System.out.println(findUnpairedElem(a1));
		
		

	}
	 public static int[] solution(int[] A, int K) {
	        // write your code in Java SE 8
	        int len=A.length;
	       K=K%len;
	        System.out.println(K);
	        int B[]=new int[len];
	        for(int i=0;i<len;i++){
	            if(i<K)B[i]=A[len+i-K];
	            else B[i]=A[i-K];
	            
	        }
	        return B;
	        
	    }
	 public static int findUnpairedElem(int[] a) {
		 Set<Integer> set=new HashSet<>();
		 for(int a1:a) {
			 set.add(a1);
		 }
		 for(int i=1;i<a.length+1;i++) {
			 if(!set.contains(i))
				 return i;
	 	 }
              return 0;
	 }
	 public static int findLength(int[] a) {
		 
		 int count=0;
		 int value=a[0];
		 while(value!=-1) {
			 value=a[value];
			 count++;
		 }
		 return count;
		 
		 
		 
		 
		 
		 
	 }

}
