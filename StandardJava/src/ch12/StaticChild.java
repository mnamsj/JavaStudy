package ch12;

public class StaticChild extends Staticparent {
	private static int age;
	
	public static void printInfo() {
		System.out.println("Child");
		System.out.println("name :"+name);
		System.out.println("age:"+age);
	}
	
	public static int getAge() {
	return age;
	}
	
	public static void setAge(int age) {
		StaticChild.age=age;
	}

}
