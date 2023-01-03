package ch10;

public class PublicTest {
	public int x;
	private int y;
	
	public PublicTest(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void print() {
		setValue();
		System.out.println("x="+x+",y="+y);
	}
	
	private void setValue(){
		x=100;
		y=100;
	}
}
