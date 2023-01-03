package ch2_Question;
//배열 a의 모든 요소의 합게를 구하여 반환
import java.util.Scanner;
public class Question2_3_AnotherType {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("배열의 요솟수 입력>");
		int num=sc.nextInt();
		
		int[]a=new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("각 배열의 요소를 입력>");
			System.out.print("a["+i+"]");
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i:a) {
			sum+=i;
		}
		System.out.println("입력한 모든 요소의 합은" +sum+ "입니다");
	}

}
