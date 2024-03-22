package org.alphatechsolutions;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Ur Number:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) 
		{
			System.out.println("");
			for(int j=0;j<n;j++) {
				System.out.print(i+" "+j+" ");
			}
		}
		

	}

}
