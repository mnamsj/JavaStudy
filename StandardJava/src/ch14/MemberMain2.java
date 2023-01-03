package ch14;

class Test2{
	public int x;
	public int y;
}

public class MemberMain2 {

	public static void main(String[] args) {
		System.out.println("toStinrg()을 재정의하지 않은 객체 출력");
		Test2 t1=new Test2();
		System.out.println("t1:"+t1);
		System.out.println("t1.toString():"+t1.toString());
		
		System.out.println("\ntoSting()을 재정의한 객체 출력");
		Member m1=new Member("aaa", "111", "서울시");
		Member m2=new Member("bbb", "222", "경기도");
		System.out.println("m1:"+m1);
		System.out.println("m2:"+m2);
	}

}
