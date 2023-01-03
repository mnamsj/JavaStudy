package ch5;
import java.util.Scanner;
public class Arr6 {
	public static void main(String[] args) {
		int[][]jumsu=new int[3][4];
		
		String[]title= {"국어", "영어", "수학", "총점"};
		
		Scanner sc=new Scanner(System.in);
		int i,j;
		
		for(i=0; i<jumsu.length; i++){
		jumsu[i][3]=0;		
		System.out.println(i+"번째 행의 점수 입력");
		for(j=0; j<jumsu[i].length-1;j++) {
			System.out.print(title[j]+"점수입력:");
			jumsu[i][j]=sc.nextInt();
			jumsu[i][3]+=jumsu[i][j];
		}
		System.out.println();
		}
		for(i=0; i<title.length; i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		
		for(i=0; i<jumsu.length; i++) {
			for(j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j]+"\t");
			}
			System.out.println();
		}
	}
	

}
