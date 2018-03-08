package Hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class Balanced_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        tests:
	        for(int a0 = 0; a0 < t; a0++){
	            String s = in.next();
	            Stack<Character> stack = new Stack<>();
	            
	            for(char c : s.toCharArray())
	            {
	                if(c == '<')
	                    stack.push('>');
	               
	                
	                else{
	                    if( stack.isEmpty() || c != stack.peek()){
	                        System.out.println("NO");
	                        continue tests;    
	                    }
	                    else{
	                        stack.pop();
	                    }
	                }
	            }
	            if(stack.isEmpty())
	                System.out.println("1");
	            else
	                System.out.println("0");
	        }
	    }
}
