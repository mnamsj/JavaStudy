package ch1_Question;
import java.util.Scanner;
public class Question1_15 {
	
	static void spira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(n-i); j++) {
				System.out.print(' ');
			} 
			for(int j=1; j<=((i-1)*2+1); j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		do { 
			System.out.print("피라미드를 몇단으로 할것인지?>");
			n=sc.nextInt();			
		} while(n<=0);
		
		System.out.println();
		spira(n);
	}

}
