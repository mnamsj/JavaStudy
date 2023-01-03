package ch3;

import java.util.Scanner;

class StudentMember {
	String School;
	int grade;
	
	public StudentMember(String School, int grade) {
		this.School=School;
		this.grade=grade;
	}
	public void print() {
		System.out.println(grade+" grade in "+School+" School");
	}
}

public class School {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("학교명을 입력하세요.\n>");
		String School=sc.nextLine();
		System.out.print("학년을 입력하세요.\n>");
		int grade=sc.nextInt();
		
		StudentMember s1=new StudentMember("JeJuElementary", 1);
		StudentMember s2=new StudentMember(School, grade);
		s1.print();
		s2.print();
	}	
}

//업무처리계층(Business Layer)/4/4/신뢰도/그림첨부/3/software Engineering Body of Knowlege(SWEBOK)/코드첨부/위아래위아래/
//0또는1개의 인스턴스/성능 및 용량/3