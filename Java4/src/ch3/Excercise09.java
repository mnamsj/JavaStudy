package ch3;
import java.util.Scanner;
public class Excercise09 {
	public static void main(String[] args) {
		boolean run=true;
		int studentNum=0;
		int[] scores=null;
		Scanner sc=new Scanner(System.in);
		//학생 수와 각 학생들의 점수를 입력받아, 최고 점수 및 평규 점수를 구하는 프로그램
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료|");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			
			int selectNo=sc.nextInt();
			
			if(selectNo==1) {
				studentNum=sc.nextInt();
				scores=new int[studentNum];
			} else if(selectNo==2) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]>");
					scores[i]=sc.nextInt();
				}
			} else if(selectNo==3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]:"+scores[i]);
				}
			} else if(selectNo==4) {
				int max=0, sum=0;
				double avg=0;
				for(int i=0; i<scores.length; i++) {
					if(max<scores[i]) {
						max=scores[i];
						System.out.println("최고점수="+max);
					}
				}
				for(int i=0; i<scores.length; i++) {
					sum=scores[i];
					avg=(float)sum/scores[i];
						System.out.print("평균점수="+avg);
				}
			} else if(selectNo==5) {
				run=false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
