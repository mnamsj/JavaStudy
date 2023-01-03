package ch3;
import java.util.Scanner;
public class Test {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String[] course = {"국어","영어","수학","과학"};
		int[] score = new int[course.length]; 
		int sum = 0;
		double avg = 0.0;

		System.out.print("이름 = ");
		String name = input.nextLine();
		
		for (int i = 0; i < course.length; i++) {

			System.out.print(course[i] + " = ");
			score[i] = input.nextInt();

			sum += score[i];
		}

		avg = sum / (float)course.length;

		System.out.println();
		System.out.println("이름 = " + name);
		
		for(int i=0;i<score.length;i++) {
			System.out.printf("%s = %d%n", course[i],score[i]);
		}

		System.out.println("총점 = " + sum);
		System.out.printf("평균 = %.2f" , avg);
		
		input.close();
	}
}
	
//1. 아래 명시한 내용을 분석해서 자바 코드를 작성하시오.
//* 이름을 입력받아 변수에 저장한다.
//* 4과목을 저장할 수 있는 배열을 생성해서 국어,영어,수학,과학 점수를 입력받아 저장한다. 
//* 배열에 저장된 과목의 점수를 이용해서 총점과 평균을 구하고 변수에 저장한다.
//* 학생이름과 국어,영어,수학,과학 점수, 총점과 평균을 출력한다.
//(전제 조건) 
//1. 입력하는 과목의 점수는 0부터 100사이의 점수만 입력한다.
//2. 국어,영어,수학,과학 점수는 배열을 생성해서 저장한다.
//3. 평균은 double형 변수에 저장한다.

		
		