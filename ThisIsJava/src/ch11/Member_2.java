package ch11;

import java.util.Arrays;
public class Member_2 implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member_2(String name, int age, int[] scores, Car car) {
		this.name=name;
		this.age=age;
		this.scores=scores;
		this.car=car;		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Member_2 cloned=(Member_2)super.clone();
		cloned.scores=Arrays.copyOf(this.scores, this.scores.length);
		cloned.car=new Car(this.car.model);
		return cloned;
	}
	
	public Member_2 getMember_2() {
		Member_2 cloned=null;
		try {
			cloned=(Member_2)clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

}
