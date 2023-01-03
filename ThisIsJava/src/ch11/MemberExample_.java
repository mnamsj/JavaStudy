package ch11;

public class MemberExample_ {
	public static void main(String[] args) {
		Member_ original=new Member_("blue", "홍길동", "12345", 25, true);
		
		Member_ cloned=original.getMember_();
		cloned.password="67890";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id:"+cloned.id);
		System.out.println("name:"+cloned.name);
		System.out.println("password:"+cloned.password);
		System.out.println("age:"+cloned.age);
		System.out.println("adult:"+cloned.adult);
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id:"+original.id);
		System.out.println("password:"+original.password);
		System.out.println("age:"+original.age);
		System.out.println("adult:"+original.adult);
		

	}

}
