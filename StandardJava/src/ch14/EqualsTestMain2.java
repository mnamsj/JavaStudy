package ch14;

public class EqualsTestMain2 {

	public static void main(String[] args) {
		EqualsTest2 e1=new EqualsTest2();
		EqualsTest2 e2=new EqualsTest2();
		e1.x=1;
		e2.x=1;
		System.out.println(e1.equals(e2));
	}

}
