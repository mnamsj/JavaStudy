package ch5;

import java.util.Scanner;

public class Arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int i, max;
			int[] arr=new int[10];
			System.out.println("정수 10개를 입려하라");
			for(i=0; i<arr.length; i++) {
					arr[i]=sc.nextInt();
			}
			max=arr[0];
			for(i=0; i<arr.length; i++) {
					if(max<arr[i]) {
							max=arr[i];
					}
			}
			System.out.println("max="+max);
	}

}
