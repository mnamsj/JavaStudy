package Question;

public class CarMaxSpeed {

	public static void main(String[] args) {
			Car maxCar;
			
			maxCar=new Car();
			maxCar.company="현재자동차";
			maxCar.model="그랜져";
			maxCar.color="검정";
			maxCar.maxSpeed=350;
			int newMaxSpeed=60;
			maxCar.print();
			System.out.println("수정된 속도 :" +newMaxSpeed);
			
	}

}
