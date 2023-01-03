package ch1;
import java.util.Scanner;
public class TriangelB {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		
		System.out.println("입력한 a(단) 삼각형을 출력");
		
		do {
			System.out.print("a값을 입력>");
			a=sc.nextInt();
		} while(a<=0);
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print('*');
			}  
			System.out.println();
		} 
	}

}
