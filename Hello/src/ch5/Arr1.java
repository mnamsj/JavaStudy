package ch5;
import java.util.Scanner;
public class Arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] intArr=new int[] {1,2,3,4,5};
		int i;
		System.out.println("초기화 된 값 출력");
		for(i=0; i<intArr.length; i++) {
				System.out.print(intArr[i]+"\t");
		}
		System.out.println();
		
		System.out.println("숫자 5개를 입력하시오");
		for(i=0; i<intArr.length; i++) {
				intArr[i]=sc.nextInt();
		}
		System.out.println("배열에 저장된 값 출력");
		for(i=0; i<intArr.length; i++) {
				System.out.print(intArr[i]+"\t");
		}
	}

}
