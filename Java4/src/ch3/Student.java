package ch3;
import java.util.Scanner;
public class Student {
	
	private String name;
	private String school;
	private int grade;
	
	public Student(String name, String school, int grade) {
		this.name=name;
		this.school=school;
		this.grade=grade;
	}
	
	public void print() {
		System.out.println("name : "+name);
		System.out.println("school : "+school);
		System.out.println("grade : "+grade);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getSchool(){
		return school;
	}
	public void setSchool(String school) {
		this.school=school;
	}
	public int getGrade() {
		return grade;
	}
	public void setgrade(int grade) {
		this.grade=grade;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String school=sc.next();
		int grade=sc.nextInt();
		sc.close();
		
		Student p=new Student(name, school, grade);
		p.print();
	}
}

