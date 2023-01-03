package ch2_Question;

import java.util.Scanner;

public class Question2_4 {
	static void copy(int[]a, int[]b) {
		int num=a.length<=b.length ? a.length : b.length;
		for(int i=1; i<num; i++) {
			a[i]=b[i];			
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("input a's array no>");
		int x=sc.nextInt();
		
		int[]a=new int[x];
		for(int i=0; i<x; i++) {
			System.out.print("a["+i+"]:");
			a[i]=sc.nextInt();
		}
		System.out.print("input b's array no>");
		int y=sc.nextInt();
		int[]b=new int[y];
		for(int i=0; i<y; i++) {
			System.out.print("b["+i+"]:");
			b[i]=sc.nextInt();
		}
		copy(a, b);
		
		System.out.println("b copy to a");
		for(int i=0; i<x; i++) {
			System.out.print("[a"+i+"]= "+a[i]);
		}
		
		
	}
}
