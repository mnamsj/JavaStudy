package ch1_Question;
import java.util.Scanner;
public class QuestionRE1_8 {
//static int sumof(Int a, int b) >>정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하는 매서드 작성
	static int Sumof(int a, int b) {
		int min, max;
		if(a<b) {
			min=a; max=b;
		} else {
			min=b; max=a;
		} 
		int sum=0;
		for(int i=min; i<=max; i++) {
			sum+=i;
		} return sum;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("input a>");
		int a=sc.nextInt();
		System.out.println("input b>");
		int b=sc.nextInt();
		System.out.print("a~b sum="+Sumof(a, b));
		
	}


}


