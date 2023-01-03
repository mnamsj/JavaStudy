package ch1_Question;
import java.util.Scanner;
public class Question1_8 {

	static int sumOf(int a, int b) {
		int min;
		int max;
		
		if(a<b) {
			min=a;
			max=b;
		} else {
			min=b;
			max=a;
		}
		int sum=0;
		for(int i=min; i<=max; i++) {
			sum+=i;
		} return sum; 
	}

	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("a의 값을 입력>");
		int a=sc.nextInt();
		System.out.println("b의 값을 입력>");
		int b=sc.nextInt();
		System.out.println("a와 b사이의 모든 수의 합>"+sumOf(a,b));
		
	}	
	
}


