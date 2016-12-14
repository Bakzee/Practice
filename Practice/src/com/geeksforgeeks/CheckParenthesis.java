package com.geeksforgeeks;
/*
 * Check whether the parenthesis are balanced or not 
 * using stack
 * O(n)
 * Use of HashMap and HashSet for storing the character keys values 
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class CheckParenthesis {
	
	private static Map<Character,Character> matchingParen = new HashMap<>();
	
	private static Set<Character> openingParen = new HashSet<>();
	
	static {
		matchingParen.put(')', '(');
		matchingParen.put('}', '{');
		matchingParen.put(']', '[');
		openingParen.addAll(matchingParen.values());
	}
	
	public static boolean checkParen(String str){
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(openingParen.contains(c))
				stack.push(c);
			if(matchingParen.containsKey(c)){
				Character lastParen = stack.pop();
				if(lastParen!=matchingParen.get(c))
					return false;
				
			}
		}
		return stack.isEmpty();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckParenthesis val = new CheckParenthesis();
		String str="[[{{(())}}]}})";
		System.out.println(val.checkParen(str));
	}

}
