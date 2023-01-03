package ch1;
import java.util.Scanner;
public class SumFor {
	public static void main(String[] args) {

		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("1~n");
	System.out.print("n : ");
	
	int n=sc.nextInt();
	int sum=0;
	for(int i=1; i<=n; i++) {
		sum+=i;
	}
	System.out.println("sum :"+sum);
	}

}
