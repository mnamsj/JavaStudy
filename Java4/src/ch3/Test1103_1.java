package ch3;
import java.util.Scanner;
public class Test1103_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1부터 100이하의 양의 정수 n값을 입력하세요.");
		System.out.print("n값>");
		int n=sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=n) {
			sum+=i;
			i++;
		} 
		System.out.println("1부터 입력한 양의 정수 n까지의 합은>"+sum);
	}
}
