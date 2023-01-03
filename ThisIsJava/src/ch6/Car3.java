package ch6;
public class Car3 {
	int gas;
	
	
	
	
	void setGas(int gas) {
		this.gas=gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("void gas");
			return false;
		}
		System.out.println("remain gas");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("runway(remain of gas :"+gas+")");
				gas-=1;
			} else {
				System.out.println("Stop runway(remain of gas:"+gas+")");
				return;
			}
		}
	}
}
