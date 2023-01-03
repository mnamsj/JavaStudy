package ch1_Question;
import java.util.Scanner;
public class Question1_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1에서 n까지의 총합");
		System.out.print("n의값 : ");
		
		int n=sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println("결과값 : "+sum);
		System.out.println("n의 값은 결과값(n+1)> "+i);
	}
}

