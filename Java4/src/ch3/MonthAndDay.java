package ch3;
import java.util.Scanner;
public class MonthAndDay {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert month and day ex)0101, 1212");
		a=sc.nextInt();
		if(a>=0101){
			System.out.println("A");
		}
		else if(a<=0630) {
			System.out.println("A");
		}
		else if(a>=0631) {
			System.out.println("B");
		}
		else if(a<=1231) {
			System.out.println("B");
		}
		else {
			System.out.println("Check Insert mmdd");
		}
	}

}
