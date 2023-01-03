package ch11;

import java.lang.reflect.*;

public class ReflectionExample {

	public static void main(String[] args) {
		Class clazz=Class.forName("ch11.Car");
		
		System.out.println("[ClassName]");
		System.out.println(clazz.getName());
		System.out.println();
		
		System.out.println("[Constructors imformtaion]");
		Constructor[] constructors=clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName()+"(");
			Class[] parameters=constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
			System.out.println();
			
			System.out.println("[field imformation]");
			Field[] fields=clazz.getDeclaredFields();
			for(Field field : fields) {
				System.out.println(field.getType().getSimpleName()+" "+field.getName());
			}
			System.out.println();
			
			System.out.println("[methods imformation]");
			Method[] methods=clazz.getDeclaredMethods();
			for(Method method : methods) {
				System.out.print(method.getName()+"(");
				Class[] parameters=method.getParameterTypes();
				printParameters(parameters);
				System.out.println(")");
		}
	}
	
	private static void printParameters(Class[] parameters) {
		for(int i=0; i<parameters.length; i++) {
		 System.out.print(parameters[i].getName());
		 if(i<(parameters.length-1)) {
			System.out.print(",");
		}
	}
}

}