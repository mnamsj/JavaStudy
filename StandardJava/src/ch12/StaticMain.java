package ch12;

public class StaticMain {

	public static void main(String[] args) {
		Staticparent sp=new Staticparent();
		sp.name="static parent";
		sp.printInfo();
		System.out.println("-----");
		
		StaticChild sc=new StaticChild();
		sc.name="static child";
		sc.setAge(10);
		sc.printInfo();
		System.out.println("-----");
		
		Staticparent spc=new StaticChild();
		spc.name="upCasting";
		spc.printInfo();
	}
}
                                  