package ch8;

interface Vehicle {
	public void run();
}

class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle=new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); (x) vehicle 인터페이스에는 checkFare()가 없음
		
		Bus bus=(Bus)vehicle;
		
		bus.run(); 
		bus.checkFare();
	}
}
