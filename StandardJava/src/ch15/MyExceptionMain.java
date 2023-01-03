package ch15;

import java.util.Scanner;

public class MyExceptionMain {

	public static void main(String[] args) {
		int cnt=0;
		int[]arr=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("원하는 크기를 입력하라");
		cnt=sc.nextInt();
		if(cnt<5) {
			try { 
				
				throw new MyException(5);
				
			} catch(MyException e) {
				//TODO Auto-generated catch block
				
				e.printStackTrace();
			} finally {
				sc.close();
			}
		} else {
			System.out.println("크기가 "+cnt+"인 배열이 만들어졌습니다.");
			arr=new int[cnt];
			}
			sc.close();
	   }
}
