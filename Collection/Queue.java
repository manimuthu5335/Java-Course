package org.alphatechsolutions;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Stack;

public class Queue {

	public static void main(String[] args) {
		
		Stack <String> stack = new Stack<>();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		System.out.println("01->"+stack.pop());
		System.out.println("02->"+stack.peek());
		System.out.println("03->"+stack);
		
				PriorityQueue <String> queue = new PriorityQueue<>();
				
				queue.add("apple");
				queue.add("banana");
				queue.add("mango");
				System.out.println("1."+queue);				
				System.out.println("2."+queue.poll());
				System.out.println("3."+queue.peek());				
				System.out.println("4."+queue);
				
				ArrayDeque <String> deque = new ArrayDeque<>();
				
				deque.offer("a");
				deque.offer("b");
				deque.offer("c");
				deque.offer("d");
				deque.offerLast("Z");
				deque.offerLast("X");
				System.out.println("4."+deque);
				System.out.println("5."+deque.pollFirst());
				System.out.println("6."+deque.pollLast());
				System.out.println("7."+deque.peek());
				System.out.println("8."+deque);
			}
		}




