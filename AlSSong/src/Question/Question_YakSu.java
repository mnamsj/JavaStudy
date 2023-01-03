package Question;
import java.util.Scanner;
public class Question_YakSu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("2개의 양의 정수값을 입력하세요.");
		int a, b;
		System.out.println("양의 정수 a의 값 입력>"); 
		a=sc.nextInt();
		System.out.println("양의 정수 b의 값 입력>");
		b=sc.nextInt();
		if(b%a==0) {
			System.out.println("b는 a의 약수입니다.");
		} else {
			System.out.println("b는 a의 약수가 아닙니다.");
		}
	}

}
