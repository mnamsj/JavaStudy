package ch12;

public class ParentMain {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.name="parent";
		p.printInfo();
		System.out.println("-------");
		Child c=new Child();
		c.name="Child";
		c.setHobby("Swimming");
		c.printInfo();
	}

}
