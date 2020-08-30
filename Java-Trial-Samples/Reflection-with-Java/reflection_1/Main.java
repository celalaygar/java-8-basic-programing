package aaa.com.celal.reflection_3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main { 
	public static void main(String[] args) { 
        OuterClass outerObject = new OuterClass();
        Class<?> innerClass = OuterClass.class.getDeclaredClasses()[0];
        Constructor<?> constructor = innerClass.getDeclaredConstructors()[0];
        constructor.setAccessible(true);
        try {
			Object innerObject = constructor.newInstance(outerObject);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) { 
			e.printStackTrace();
		}
//		output : 
//		outer object created
//		inner object created
	} 
}
class OuterClass { 
	public OuterClass() {  System.out.println("outer object created"); } 
    private class InnerClass {
    	public InnerClass() { System.out.println("inner object created"); }
    }
}