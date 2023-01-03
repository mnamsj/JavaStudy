package ch2_Question;

import java.util.Scanner;
public class Question2_3_re {
	
	static int sumOf(int[]a) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("input length of array>");
		int num=sc.nextInt();
		int[]a=new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("input character");
			System.out.print("a["+i+"]>");
			a[i]=sc.nextInt();
		}
		System.out.print("Sum of all array is"+sumOf(a));
				
	}
	
}
