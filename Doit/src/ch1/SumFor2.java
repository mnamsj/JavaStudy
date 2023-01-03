package ch1;

import java.util.Scanner;

public class SumFor2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("Sum of 1~n");
		
		do {
			System.out.print("N>");
			n=sc.nextInt();
		} while(n<=0);
	
		int sum=0;
		
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println("Sum of 1~n="+sum);
	}
}
