package ch3;
import java.util.Scanner;
public class Test1103_1J {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();

		int sum=0;
		while(n>=0){
		sum+=n--;
		}
		System.out.println(sum);
	}

}
