package ch11;

public class SystemEnvExmaple {

	public static void main(String[] args) {
		String javaHome=System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME:"+javaHome);
	}

}
