package ch1_Question;//a와 b를 포함한 그 사이의 모든 정수의 합
import java.util.Scanner;
public class Question1_8_re {
	
	static int sumof(int a, int b) {
		int max;
		int min;
		
		if(a>b) {
			max=a;
			min=b;
		} else {
			max=b;
			min=a;
		} 
		int sum=0;
		for(int i=min; i<=max; i++) {
			sum+=i;
		} return sum;
	}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("a :");
		int a=sc.nextInt();
		System.out.println("b :");
		int b=sc.nextInt();
		System.out.println("a~b along sum : "+sumof(a, b));
		
	}

}
