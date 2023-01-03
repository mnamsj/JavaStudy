package ch7;
public abstract class Phone {
	public String Owner;
	
	
	public Phone(String owner) {
		this.Owner=owner;		
	}
	
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}

	