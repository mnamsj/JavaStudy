package ch5;

import java.util.Scanner;

class EUclideanMethodOfMutualDivision {
	
	static int gcd(int x, int y) {
		if(y==0) {
			return x;
		} else {
				return gcd(x, x%y);
		}
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("두 정수의 최대 공약수");
		
		System.out.print("정수를 입력하세요 : ");
		int x=sc.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int y=sc.nextInt();
		
		System.out.println("최대공약수는"+gcd(x, y)+"입니다.");
	}
	
	

}
