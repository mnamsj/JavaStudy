package ch5;
import java.util.Scanner;
public class Arr7 {

	public static void main(String[] args) {

		String[] name=new String[3];
		int[][] jumsu=new int[3][4];
		float[] avg=new float[3];
		
		String[] title= {"이름","국어","영어","수학","총점","평균"};
		Scanner sc=new Scanner(System.in);
		int i,j;
		
		for(i=0; i<jumsu.length; i++) {
			System.out.println(i+"번째 사람의 정보 입력");
			System.out.print(title[0]+"입력:");
			name[i]=sc.next();
			jumsu[i][3]=0;
			for(j=0; j<jumsu[i].length-1; j++) {
				System.out.print(title[j+1]+"점수입력:");
				jumsu[i][j]=sc.nextInt();
				jumsu[i][3]+=jumsu[i][j];
				}
			avg[i]=(float)jumsu[i][3]/3;
			
			System.out.println();
			}
			for(i=0; i<title.length; i++) {
				System.out.print(title[i]+"\t");
			}
			System.out.println();
			
			for(i=0; i<jumsu.length; i++) {
				System.out.print(name[i]+"\t");
				for(j=0; j<jumsu[i].length; j++) {
					System.out.print(jumsu[i][j]+"\t");
				}
				System.out.print(avg[i]+"\n");
			}
			
		
		
		}
	}


