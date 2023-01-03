package Question;

import java.util.Scanner;

public class Question7_1 {

	public static int signOf(int n){
		// TODO Auto-generated method stub
			int sign=0;
			if(n>0) {
				sign=1;
			}
			if(n<0) {
				sign=-1;
			}
			return sign;
	}
		
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("insert number");
			int x=sc.nextInt();
			int s=signOf(x);
			System.out.println("signOf(x) is "+s+".");
		}
}
