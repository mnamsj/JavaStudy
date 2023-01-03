package ch11_2;

public class NewInstanceExmaple {

	public static void main(String[] args) {
		try {
			//Class clazz=Class.forName("ch11_2.SendAction");
			Class clazz=Class.forName("ch11_2.ReceiveAction");
			Action action=(Action)clazz.newInstance();
			action.execute();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(InstantiationException e) {
			e.printStackTrace();
		} catch(IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
