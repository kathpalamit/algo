package com.kathpal.coding;

import java.util.Stack;

public class bracesCompile {
	
	public static void main(String[] args) {
		
		System.out.println(isCompile("[]{}()"));
		
		System.out.println(isCompile("[{]}()"));
		
	}

	
	private static boolean isCompile(String str) {
		
		Stack<Character> charStack = new Stack<Character>();
		for(char c : str.toCharArray()) {
			
			if(c=='{'||c=='['||c=='(') {
				charStack.push(c);
				continue;
			}			
			
			if(c=='}'||c==']'||c==')') {
				
				if(charStack.isEmpty()) {
					return false;
				}
				else {
					char last=charStack.pop();
					
					if((last=='{' && c=='}')||(c==']' && last=='[')||(c==')'&& last=='(')) {
						continue;
					}else {
						return false;
					}
				}
			}
		}
		
		if(charStack.isEmpty()) {
			return true;
		}else {
		
		return false;
		}
		
	}
}
