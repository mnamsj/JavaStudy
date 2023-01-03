package ch3_Question;

import java.util.Scanner;

public class Question_3_2 {

	static int SeqSearch(int[]a, int n, int key) {
		System.out.print("   |");
		for(int k=0; k<n; k++) {
			System.out.printf("%4d", k);
		} 
		System.out.println();
		
		System.out.print("---+");
		for(int k=0; k<4*n+2; k++) {
			System.out.print("-");
		}
		System.out.println();
		
		for(int i=0; i<n; i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i*4)+3), "");
			System.out.printf("%3d|",i);
			for(int k=0; k<n; k++) {
				System.out.printf("%4d", a[k]);
			}
			System.out.println("\n   |");
			if(a[i]==key) {
				return i;
			}			
		}
		return -1;
	}
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			System.out.print("요솟수 : ");
			int num=sc.nextInt();
			int[]x=new int[num];
			
			for(int i=0; i<num; i++) {
				System.out.print("x["+i+"]: ");
				x[i]=sc.nextInt();
			}
			
			System.out.print("검색값 : ");
			int ky=sc.nextInt();
			int idx=SeqSearch(x, num, ky);
			
			if(idx==-1) {
				System.out.print("해당하는 요소수의 값 x");
			} else {
				System.out.print("해당하는 요소수의 값 x["+idx+"]에 있음");
		}
	} 		
}