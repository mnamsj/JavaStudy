package ch11;

public class Parent {
	public String name;
	protected int age;
	private int money;
	
	public Parent() {
		System.out.println("Parent 생성자");
	}
	
	public void printParentInfo() {
		System.out.println("name : "+name);
		System.out.println("age : "+age);
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money=money;
	}
}
