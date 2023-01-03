package Question;
import java.util.Scanner;
public class Question4_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("정수값 : ");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
			if(n%i==0) {
					System.out.print(i+" ");
					count++;					
			}
		System.out.println("\n의 약수는"+count+"개입니다.");
	}
	

}
