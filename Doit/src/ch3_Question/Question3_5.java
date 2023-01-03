package ch3_Question;

import java.util.Scanner;

public class Question3_5 {
	
	static int binSearchX(int[] a, int n, int key) {
		int pl=0;
		int pr=n-1;
		
		do {
			int pc=(pl+pr)/2;
			if(a[pc]==key) {
				for(;pc>pl;pc--) {
					if(a[pc-1]<key) {
						break;
					}
				}
				return pc;
			} else if(a[pc]<key) {
				pl=pc+1;
			} else {
				pr=pc-1;
			}
		} while(pl<=pr);
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("요솟수 입력 : ");
		int num=sc.nextInt();
		int[]x=new int[num];
		
		System.out.print("오름차순으로 입력\n");
		System.out.print("입력x[0] : ");
		x[0]=sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+i+"]: ");
				x[i]=sc.nextInt();
			} while(x[i]<x[i-1]);
		}
		System.out.print("검색 값 : ");
		int ky=sc.nextInt();
		int idx=binSearchX(x, num, ky);
		
		if(idx==-1) {
			System.out.print("검색하려는 요소수 없음");
		} else {
			System.out.print("그 값은 x["+idx+"]에 있음");
		}
	}
	
	

}
