package ch2_Question;
import java.util.Scanner;
public class Question2_5 {
	static void rcopy(int[]a, int[]b) {
		int num=a.length<=b.length ? a.length : b.length;
		for(int i=0; i<num; i++) {
			a[i]=b[b.length-i-1];
		}
	}	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("input a's number of array");
		int x=sc.nextInt();
		int[]a=new int[x];
		for(int i=0; i<x; i++) {
			System.out.print("a["+i+"]>");
			a[i]=sc.nextInt();
		}
		System.out.println("input b's number of array");
		int y=sc.nextInt();
		int[]b=new int[y];
		for(int i=0; i<y; i++) {
			System.out.print("b["+i+"]>");
			b[i]=sc.nextInt();
		}
		rcopy(a,b);
		
		System.out.println("b copy to a reverse");
		for(int i=0; i<x; i++){
		System.out.println("a["+i+"]"+a[i]);
	}
}
}