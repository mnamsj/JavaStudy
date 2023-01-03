package ch1_Question;
import java.util.Scanner;                                               //*을 입력하여 정사각형 출력(변의 길이5)
public class Question1_13 {                                             //*****
                                                                        //*****
	public static void main(String[] args) {                            //*****
		Scanner sc=new Scanner(System.in);
		int a;
		
		System.out.println("정사각형을 출력합니다.");
		
		do {
			System.out.print("임의의 변의 길이를 입력하세요>");
			a=sc.nextInt();
		} while(a<=0);
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a; j++) {  //직각 삼각형으로 출력하고 싶으면 17열의 a를 i로 바꾸면됨
				System.out.print('*');
			}
			System.out.println();
		}
	}
}


