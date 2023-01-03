package ch7;
public class DmbCellphoneExample {
	public static void main(String[] args) {
		DmbCellphone dmbCellphone=new DmbCellphone("자파폰", "검정", 10);
		
		
		System.out.println("모델"+dmbCellphone.model);
		System.out.println("색상"+dmbCellphone.color);
		
		
		System.out.println("채널 : "+dmbCellphone.channel);
		
		
		dmbCellphone.powerON();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("여보시요");
		dmbCellphone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbCellphone.sendVoice("아~예 반갑습니다.");
		dmbCellphone.hangUP();
		
		
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();
		
		
	}

}
