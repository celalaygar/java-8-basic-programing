package aaa.com.celal.reflection_2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import aaa.com.celal.reflection_2.Test.innerTest;

public class MainReflectionForInnerClass {

	public static void main(String[] args) {

		try {

			Test test = new Test();
			innerTest obj = test.new innerTest();

			// Class cls = innerTest.class;
			Class cls = Class.forName("aaa.com.celal.reflection_2.Test$innerTest");

			System.out.println("class name is " + cls.getName()); // class name is aaa.com.celal.reflection_2.Test$innerTest

//			Method[] methods = cls.getDeclaredMethods();
//	        Method[] methods = cls.getMethods();
//	        for (Method method : methods) 
//	            System.out.println(method.getName());

			Method methodcall2 = cls.getDeclaredMethod("method1");
			methodcall2.invoke(obj); // innerTest name is innerTest class for Reflection

			Method methodcall1 = cls.getMethod("method2", int.class, int.class);
			methodcall1.invoke(obj, 3, 5); // innerTest number is (x+y) 8

			Method methodcall6 = cls.getDeclaredMethod("method6", int.class);
			methodcall6.setAccessible(true);
			int resultInt = (int) methodcall6.invoke(obj, 11); // innerTest Private method invoked in int 121

			System.out.println("return value for method6 " + resultInt); // return value for method6 11

			Field field2 = cls.getDeclaredField("value");
			field2.setAccessible(true);
			field2.set(obj, 25);

			Method methodcall7 = cls.getDeclaredMethod("method7");
			methodcall7.invoke(obj); // innerTest value is 25

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
