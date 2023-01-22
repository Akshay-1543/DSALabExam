package com.labexam.demo;


public class StackLinkedListMain {

	public static void main(String[] args)
	{
		StackLinkedList stack = new StackLinkedList();
	        stack.push(10);
	        stack.push(20);
	        stack.push(30);
	        stack.push(40);
	        stack.push(50);
	        stack.push(60);

	        System.out.println(stack.peek()); // should print 3
	        System.out.println(stack.pop()); // should print 3
	        System.out.println(stack.pop()); // should print 2
	        System.out.println(stack.isEmpty()); // should print false
	}

}
