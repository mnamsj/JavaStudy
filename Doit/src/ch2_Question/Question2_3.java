package ch2_Question;

import java.util.Scanner;
public class Question2_3 {
	static int sumOf(int[]a) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		} return sum;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("요소수 입력>");
		int num=sc.nextInt();
		
		int[]a=new int[num];

		for(int i=0; i<num; i++) {
			System.out.print("a["+i+"]:");
			a[i]=sc.nextInt();
			
		}
		
		System.out.println("각 배열의 요솟수의 모든합은 "+sumOf(a)+"입니다");
		
		
		
	}
}

