package aaa.com.celal.reflection_2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MainReflection {
	public static void main(String[] args) {
		try {
			Test obj = new Test();

			Class cls = Class.forName("aaa.com.celal.reflection_2.Test");
			// Class cls = obj.getClass();

			// class name is aaa.com.celal.reflection_2.Test
			System.out.println("class name is " + cls.getName());

			Constructor constructor = cls.getConstructor();

			// Constructor name is aaa.com.celal.reflection_2.Test
			System.out.println("Constructor name is " + constructor.getName());

//			Method[] methods = cls.getDeclaredMethods();
//	        Method[] methods = cls.getMethods();
//	        for (Method method : methods) 
//	            System.out.println(method.getName());

			Method methodcall1 = cls.getMethod("method2", int.class, int.class);
			methodcall1.invoke(obj, 11, 22); // The number is (x+y) 33

			Field field = cls.getDeclaredField("s");
			field.setAccessible(true);
			field.set(obj, "JAVA");

			// s type : class java.lang.String private
			System.out.println("s type : " + field.getType() + " " + Modifier.toString(field.getModifiers()));

			Field field2 = cls.getDeclaredField("value");
			field2.setAccessible(true);
			field2.set(obj, 2);

			// value type : int private
			System.out.println("value type : " + field2.getType() + " " + Modifier.toString(field2.getModifiers()));

			Method methodcall2 = cls.getDeclaredMethod("method1");
			methodcall2.invoke(obj); // The string is JAVA

			Method methodcall3 = cls.getDeclaredMethod("method3");
			methodcall3.setAccessible(true);
			methodcall3.invoke(obj); // Private method invoked 1

			Method methodcall4 = cls.getDeclaredMethod("method4", int.class);
			methodcall4.setAccessible(true);
			methodcall4.invoke(obj, 22); // Private method invoked 2 22

			Method methodcall5 = cls.getDeclaredMethod("method5", String.class);
			methodcall5.setAccessible(true);
			String result = methodcall5.invoke(obj, "Celal Aygar").toString(); // Private method invoked in string Celal
																				// Aygar

			// return value for method5 Celal Aygar
			System.out.println("return value for method5 " + result);

			Method methodcall6 = cls.getDeclaredMethod("method6", int.class);
			methodcall6.setAccessible(true);
			int resultInt = (int) methodcall6.invoke(obj, 5); // Private method invoked in int 25

			// return value for method6 5
			System.out.println("return value for method6 " + resultInt);

			Method methodcall7 = cls.getDeclaredMethod("method7");
			methodcall7.invoke(obj); // The int is 2

			System.out.println("----------------------------------------------");
			System.out.println(
					"methodcall1 : " + Modifier.toString(methodcall1.getModifiers()) + " \n" + // methodcall1 : public
					"methodcall2 : " + Modifier.toString(methodcall2.getModifiers()) + " \n" + // methodcall2 : public
					"methodcall3 : " + Modifier.toString(methodcall3.getModifiers()) + " \n" + // methodcall3 : private
					"methodcall4 : " + Modifier.toString(methodcall4.getModifiers()) + " \n" + // methodcall4 : private
					"methodcall5 : " + Modifier.toString(methodcall5.getModifiers()) + " \n" + // methodcall5 : private
					"methodcall6 : " + Modifier.toString(methodcall6.getModifiers()) + " \n" // methodcall6 : private
			);
		} catch (NoSuchMethodException | SecurityException e) {
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

//		output : 
//		class name is aaa.com.celal.reflection_2.Test
//		Constructor name is aaa.com.celal.reflection_2.Test
//		The number is (x+y) 33
//		s type : class java.lang.String private
//		value type : int private
//		The string is JAVA
//		Private method invoked 1
//		Private method invoked 2 22
//		Private method invoked in string Celal Aygar
//		return value for method5 Celal Aygar
//		Private method invoked in int 25
//		return value for method6 5
//		The int is 2
//		----------------------------------------------
//		methodcall1 : public 
//		methodcall2 : public 
//		methodcall3 : private 
//		methodcall4 : private 
//		methodcall5 : private 
//		methodcall6 : private 

	}
}
