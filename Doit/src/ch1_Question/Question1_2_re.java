package ch1_Question; //세 값의 최소값을 구하는 min3메서드 작성
import java.util.Scanner;
public class Question1_2_re {

	static int min3(int a, int b, int c) {
		int min=a;
		if(b<min){
			min=b;
		} if(c<min) {
			min=c;
		}
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("세개의 값을 입력>");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.print("입력값중 최소값은 >"+min3(a,b,c));
	}
}
