package ch3_Question;
//요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터 순서대로 저장, 일치하는 요솟수를 반환하는 매서드 작성
//ex) 요솟수가 8인 배열 a의 요소가 {1,9,2,9,4,6,7,9}이고 key값이 9일 때 배열 idx에 {1,3,7]을 저장하고 3을 반환
import java.util.Scanner;
public class Question3_3 {
	static int searchIdx(int[]a, int n, int key, int[]idx) {
		int count=0;
		for(int i=0; i<n; i++) {
			if(a[i]==key) {
				idx[count++]=i;
			} 
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("요솟수값 입력 : ");
		int num=sc.nextInt();
		int[]x=new int[num];
		int[]y=new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]");
			x[i]=sc.nextInt();
		}
		
		System.out.print("검색 값 : ");
		int ky=sc.nextInt();
		int count=searchIdx(x, num, ky, y);
		
		if(count==0) {
			System.out.print("일치하는 요소수값 없음");
		} else {
			for(int i=0; i<count; i++) {
				System.out.println("검색한 요소수의 값은 x["+y[i]+"]에 있음");
			}
		}
	}
}
