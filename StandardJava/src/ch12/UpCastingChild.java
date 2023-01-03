package ch12;

public class UpCastingChild extends UpCastingParent {
	private int z;
	
	public UpCastingChild(){
		x=100;
		y=200;
		z=300;
	}
	
	@Override
	public int add() { //상속받은 add재정의
		System.out.println("child의 add()");
		return x+y+z;
	}
	
	public int sub() { //sub메서드를 추가로 정의
		System.out.println("childd의 sub()");
		return x-y-z;
	}
	
	public int getZ() {
		return z;
	}
	
	public void setZ(int z){
	this.z=z;
	}

}
