package Question;

import java.util.Scanner;
public class DigitNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("입력한 양의 정수값 출력");
		int a;
		do { 
			System.out.print("임의의 정수값 입력>");
			a=sc.nextInt();			
		} while(a<=0);
		
		int no=0;
		while(a>0) {
			a/=10;
			no++;
		}
		System.out.print("입력한 정수값의 자릿수는"+no+"입니다.");
	}

}
