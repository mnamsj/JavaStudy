package ch6;
public class Car5 {
	String model;
	int speed;
	
	
	Car5(String model){
		this.model=model;
	}
	
	
	void setSPeed(int speed) {
		this.speed=speed;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSPeed(i);
			System.out.println(this.model+"가 달립니다(시속:"+this.speed+"km/h)");
		}
		
	}
	
}
