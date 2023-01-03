package ch5;

import java.util.Scanner;

class Recur {
	
	static void recur(int n) {
		if(n>0) {
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}
	}
	
	public static void main(String[] agrs) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("input : ");
		int x=sc.nextInt();
		
		recur(x);
	}

}
