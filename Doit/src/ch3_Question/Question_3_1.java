package ch3_Question;
// seqSearchSen for문 사용(무한루프)
import java.util.Scanner;

public class Question_3_1 {

	static int seqSearchSen(int []a, int n, int key) {
		int i=0;
		
		a[n]=key;
		
		for(;true;) {
			if(a[i]==key) {
			break;
		} i++;
		}
		return i==n ? -1:i;
		}
		
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("요솟수");
		int num=sc.nextInt();
		int[]x=new int[num+1];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]");
			x[i]=sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky=sc.nextInt();
		int idx=seqSearchSen(x, num, ky);
		
		if(idx==-1) {
			System.out.println("그 값의 요소는 없다.");
		} else {
			System.out.println("그 값은 x["+idx+"]에 있음");
		}
	}
}

