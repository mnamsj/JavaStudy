package ch3;
import java.util.Scanner;
public class Test_1027 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] Subject= {"국어", "영어", "수학", "과학"};
		int[] Score=new int[Subject.length];
		int sum=0;
		double avg=0.0;
		
		System.out.println("<학생의 이름을 입력>");
		String name=sc.nextLine();
		System.out.println();
		System.out.println("<각 항목에 맞게 점수를 순차적으로 입력>");
		for(int i=0; i<Subject.length; i++) {
			System.out.print(Subject[i]+" : ");
			Score[i]=sc.nextInt();
			sum+=Score[i];
		}
		System.out.println();
		System.out.println("<"+name+"학생의 성적표>");
		avg=sum/(float)Subject.length;
		
		for(int i=0; i<Subject.length; i++) {
			System.out.println(Subject[i]+" : "+Score[i]);
		} 
		System.out.println("----------");
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
	}
}

//컴퓨터 프로그램의 조직화된 집합체로서 프로그램이 작성되고 실행에 이르기까지 소스형식, 목적형식, 로드형식을 취함
//결과의 변경없이 코드의 구조를 재조정함을 뜻함, 주로 가독성을 높이고 유지보수를 편하게함
//리팩토링 패턴의 대표적인 예는 필드 은닉, 메서드 추출, 타입 일반화, 메서드 이름 변경 등이 해당
