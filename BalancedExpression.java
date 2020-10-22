package java1.epam;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedExpression {

	public static void main(String[] args) {
		System.out.println("practising Epam");
		String expression="([{}{}65])";
		if(balancedExpression(expression))System.out.println("balanced");
		else System.out.println("not balanced");

	}

	private static boolean balancedExpression(String expre) {
		Deque<Character> deq=new ArrayDeque<Character>();
		for(int i=0;i<expre.length();i++) {
			char x=expre.charAt(i);
			if(x=='(' || x=='['||x=='{') {
				deq.push(x);
				continue;
			}
			//System.out.println(deq);
			if(deq.isEmpty()) return false;
			char check;
			switch(x) {
			case ')': check=deq.pop();
					  if(check=='{'||check=='[')
						  return false;
					  break;
			case '}':check=deq.pop();
					 if(check=='('||check=='[')
						 return false;
					 break;
			case ']' : check=deq.pop();
						if(check=='('||check=='{')
							return false;
						break;
			default :return false;
						
			}
			
			System.out.println(deq);
			
		}
		return (deq.isEmpty());
	}
	

}
