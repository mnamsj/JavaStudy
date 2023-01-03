package Question;
import java.util.Scanner;
public class Question3_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 a와 b의 값을 입력하세요.");
		System.out.print("a의값>");
		int a=sc.nextInt();
		System.out.print("b의값>");
		int b=sc.nextInt();
		if(a>b) { 
			System.out.println("a의 값이 큽니다.");			
		} else if(a<b) { 
			System.out.println("b의 값이 큽니다.");
		} else { 
			System.out.println("a와 b의 값은 같습니다.");
		}
	}
}

