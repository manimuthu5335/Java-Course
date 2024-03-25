package org.alphatechsolutions;
import java.util.*;

public class KLargest {
	
	// Function to find k largest array element
	
	static void klargest(int a[],int n ,int k) {
		// Implementation using  a Priority Queue
				
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for (int i=0;i<n;++i) {
			//Insert elements into the priority queue
			pq.add(a[i]);
			// If size of the priority queue exceeds k
			if(pq.size()>k) {
				pq.poll();
			}
		}
		// Print the k largest element
		while (!pq.isEmpty()) {
			System.out.println(pq.peek()+ " ");
			pq.poll();
		}
		System.out.println();
	}
		//Driver Code
	public static void main(String[] args) {
		int a[]= {11,3,2,1,15,5,4,45,88,232,533,96,50,45};
		int n = a.length;
		int k = 3;
		System.out.println("---------------------------");
		System.out.println(k + " Largest Elements are : ");
		System.out.println("---------------------------");

		// Function call
		klargest(a,n,k);
		System.out.println("<--------------------------->");		

	}

}
