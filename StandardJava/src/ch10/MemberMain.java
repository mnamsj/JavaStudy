package ch10;

public class MemberMain {

	public static void main(String[] args) {
		Member m=new Member();
		
		m.setName("KIM");
		m.setTel("5555");
		m.setAddress("seoul");
		
		String name=m.getName();
		String tel=m.getTel();
		String address=m.getAddress();
		
		System.out.println("name:"+name);
		System.out.println("tel:"+tel);
		System.out.println("address:"+address);

	}

}
