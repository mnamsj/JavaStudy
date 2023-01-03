package ch14;

class Test {
	public int x;
	public int y;
}

public class HashTestMain {

	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=t1;
		Test t3=new Test();
		
		System.out.println("t1.hashCode():"+t1.hashCode());
		System.out.println("t2.hashCode():"+t2.hashCode());
		System.out.println("t3.hashCode():"+t3.hashCode());
	}

}
