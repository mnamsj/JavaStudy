package ch1_Question;
import java.util.Scanner;
public class Question1_3_re {

	static int min4(int a, int b, int c, int d) {
		int min=a;
		if(a>b) {
			min=b;
		} if(b>c) {
			min=c;
		} if(c>d) {
			min=d;
		} return min;
	}	
	public static void main(String[] args) {
		System.out.println("4,5,7,9에서 가장 작은 숫자는>"+min4(4,5,7,9));

	}

}
