package ch6;
public class Car3Example {
	public static void main(String[] args) {
	Car3 myCar=new Car3();
	
	myCar.setGas(5);
	
	boolean gasState=myCar.isLeftGas();
	if(gasState) {
		System.out.println("Start to run");
		myCar.run();
	}
	
	if(myCar.isLeftGas()){
		System.out.println("don't need supply to gas");		
	} else {
		System.out.println("You need supply to gas");
	}
  }
}

