package Puzzle;

import dataStructures.Stack;

public class BracketChecker {
	private String str;
	
	public BracketChecker(String str){
		this.str = str;
	}
	
	public boolean check(){
		int stackSize = str.length();
		Stack myStack = new Stack(stackSize);
		
		for (int i = 0; i < str.length(); i++)
	    {
	        char current = str.charAt(i);
	        if (current == '{' || current == '(' || current == '[')
	        {
	        	myStack.push(current);
	        }


	        if (current == '}' || current == ')' || current == ']')
	        {
	            if (myStack.isEmpty())
	                return false;

	            char last = (char) myStack.peek();
	            
	            if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
	            	myStack.pop();
	            else 
	                return false;
	        }

	    }

	    return myStack.isEmpty();

				
	}			
					
}
