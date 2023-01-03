package ch1_Question;
import java.util.Scanner;
public class Question1_1_1 {
	
	static int max3(int a, int b, int c) {
		int max=a;
		if(b>max) {
			max=b;
		} if(c>max) {
			max=c;
		} return max;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("input number");
		System.out.println("A : ");
		int a=sc.nextInt();
		System.out.println("B : ");
		int b=sc.nextInt();
		System.out.println("C : ");
		int c=sc.nextInt();
		
		System.out.println("max3 :"+max3(a,b,c));
	}
	
}
