package Question;
import java.util.Scanner;
public class Question7_2 {
//3개의 int형 인수 a, b, c 중 최솟값을 구하는 min 메서드를 작성하자.
	//int min(int a, int b, int c)
	public static int min(int a, int b, int c) {
		int min=a;
		if(b<min)min=b;
		if(c<min)min=c;
		return min;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("a:"); int a=sc.nextInt();
		System.out.print("b:"); int b=sc.nextInt();
		System.out.print("c:"); int c=sc.nextInt();
		System.out.print("min : "+min(a,b,c)+"//");
	}

}
