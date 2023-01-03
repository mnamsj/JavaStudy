package ch1_Question;
import java.util.Scanner;
public class Question1_16 {
	
	static void npira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(n-i); j++) {
				System.out.print(' ');
			}
			for(int j=1; j<=((i-1)*2+1); j++) {
				System.out.print(i%10);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		do {
			System.out.println("n단의 숫자 피라미드가 출력될건데 숫자를 몇으로 할건지>");
			n=sc.nextInt();
		} while(n<=0);
		
		npira(n);
	}
}
