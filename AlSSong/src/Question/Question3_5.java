package Question;

import java.util.Scanner;

public class Question3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자입력");
		a=sc.nextInt();		
		if(a>0) {
			System.out.println("양수");
		}else if(a<0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
			
		
		}
	}


