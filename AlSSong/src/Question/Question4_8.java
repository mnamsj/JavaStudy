package Question;
import java.util.Scanner;
public class Question4_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		
		System.out.println("입력한 a값만큼 *와 +를 번갈아 가며 출력");
		
		do {
			System.out.print("a값 입력>");
			a=sc.nextInt();
		} while(a<=0);
		
		for(int i=1; i<=a/2; i++) {
			System.out.print("*+");
		}
		if (a%2!= 0) {
            System.out.print('*');
		}
	}
}
