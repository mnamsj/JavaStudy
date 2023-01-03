package ch12;

public class SuperChild extends SuperParent {
	
	private int a=20;
	
	public void print() {
		System.out.println("SuperChild의 print()");
		System.out.println("a="+a+"\n");
		SuperCall();
	}
	public void SuperCall() {
		System.out.println("super.a="+super.a);
		super.print();
	}
	

}
