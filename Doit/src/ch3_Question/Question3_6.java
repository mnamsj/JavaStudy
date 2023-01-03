package ch3_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Question3_6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
	System.out.print("요솟수 입력 : ");
	int num=sc.nextInt();
	int[]x=new int[num];
	
	System.out.println("순차대로 입력");
	
	System.out.print("x[0] : ");
	x[0]=sc.nextInt();
	
	for(int i=1; i<num; i++) {
		do{ 
			System.out.print("x["+i+"]: ");
			x[i]=sc.nextInt();
		} while(x[i]<x[i-1]);
	}
	
	System.out.println("검색할 요소값 : ");
	int ky=sc.nextInt();
	
	int idx=Arrays.binarySearch(x, ky);
	
	if(idx<0) {
		int inspoint=-idx-1;
		System.out.println("요소에 해당하는 값 없음");
		System.out.printf("삽입 포인트는 %d 입니다.\n", inspoint);
		System.out.printf("x[%d]의 바로앞에 %d를 삽입하면 올바른 배열 형성", inspoint, ky);
	}
	}
	
	
}
