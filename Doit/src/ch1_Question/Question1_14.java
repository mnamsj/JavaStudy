package ch1_Question;
import java.util.Scanner;
public class Question1_14 {

	static void triangleB(int a) { //왼쪽 아래가 직각인 이등변삼각형 출력
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print('*');
		}
		System.out.println();
	}
}
	
	static void triangleU(int a) {
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a-i+1; j++) {
				System.out.print('*');
		}
		System.out.println();
	}
}
	
	static void triangleRU(int a) {
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(' ');
			} for(int j=1; j<=a-i+1; j++) {
				System.out.print('*');
			} 
			System.out.println();
	}
}
	static void triangleRB(int a) {
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a-i; j++) {
				System.out.print(' ');
			} for(int j=1; j<=i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		do { 
			System.out.print("[입력한 단수만큼의 직각삼각형을 출력] 입력값>");
			a=sc.nextInt();
		} while(a<=0);
	
	
	System.out.println();
	triangleB(a);
	System.out.println();
	triangleU(a);
	System.out.println();
	triangleRU(a);
	System.out.println();
	triangleRB(a);
	}
}
