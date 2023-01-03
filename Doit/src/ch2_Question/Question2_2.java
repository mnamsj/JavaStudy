package ch2_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Question2_2 {
	
	static void swap(int[]a, int idx1, int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	
	static void reverse(int[]a) {
		for(int i=0; i<a.length/2; i++) {
			System.out.println("a["+i+"]와 a["+(a.length-i-1)+"]울 교환");
			swap(a, i, a.length-i-1);
			System.out.println(Arrays.toString(a));
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("요솟수 입력>");
		
		int num=sc.nextInt();
		int[]x=new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("x["+i+"]");
			x[i]=sc.nextInt();
		}
		reverse(x);
		
		System.out.print("역순정렬완료");

	}
}
