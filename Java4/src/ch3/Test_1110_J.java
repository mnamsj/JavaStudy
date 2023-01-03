package ch3;
import java.util.Scanner;
	 
	public class Test_1110_J {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String schoolName = sc.next();
	        int grade = sc.nextInt();
	        sc.close();
	         
	        Student stu1 = new Student("Jejuelementary", 6);
	        Student stu2 = new Student(schoolName, grade);
	         
	        stu1.print();
	        stu2.print();
	    }
	}
	 
	class Student {
	    private String schoolName;
	    private int grade;
	 
	    public Student(String schoolName, int grade) {
	        this.schoolName = schoolName;
	        this.grade = grade;
	    }
	 
	    public void print() {
	        System.out.println(grade + " grade in " + schoolName + " School");
	    }
	}

