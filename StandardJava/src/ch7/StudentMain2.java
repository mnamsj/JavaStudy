package ch7;
public class StudentMain2 {
	public static void main(String[] args) {

		
		Student s3=new Student();
		s3.name="유재석";
		s3.kor=70;
		s3.eng=80;
		s3.math=90;
		s3.eval_sum();
		s3.eval_avg();
		System.out.println("객체 s3의 정보");
		s3.print();
		System.out.println();
		
		Student s4=new Student();
		s4.name="박명수";
		s4.kor=100;
		s4.eng=80;
		s4.math=76;
		s4.eval_sum();
		s4.eval_avg();
		System.out.println("객체 s4의 정보");
		s4.print();
		System.out.println();
		
		Student s5=new Student();
		s5.name="신재일";
		s5.kor=57;
		s5.eng=98;
		s5.math=89;
		s5.eval_sum();
		s5.eval_avg();
		System.out.println("객체 s5의 정보");
		s5.print();		
	}
}

