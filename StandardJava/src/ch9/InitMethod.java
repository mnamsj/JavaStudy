package ch9;
public class InitMethod {

	int x=initMeber();
	static int y=initMember_s();
	
	final int initMeber() {
		return 10;
	}

	static int initMember_s(){
		return 10;
	}
	
	InitMethod(){
		System.out.println("생성자 실행전");
		System.out.println("x="+x);
		System.out.println("y="+y);
		x=20;
		y=20;
	}
	
	void print() {
		System.out.println("생성자 실행후");
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}


