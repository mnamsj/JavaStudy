package ch7;

public class Student {

		String name;
		int kor;
		int eng;
		int math;
		int sum;
		float avg;
		
		void eval_sum() {
			sum=kor+eng+math;
		}
		
		void eval_avg() {
			avg=(float)sum/3;
		}
		
		void print() {
			System.out.println("이름 : "+name);
			System.out.println("국어 : "+kor);
			System.out.println("영어 : "+eng);
			System.out.println("수학 : "+math);
			System.out.println("총점 : "+sum);
			System.out.println("평균 : "+avg);
		}
}
