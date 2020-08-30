package functional_java;

public class MaiinClass {

	public static void main(String[] args) {  
        FuncInterface fobj = (int x)->System.out.println(2*x);  
        fobj.abstractFun(5); 
    	
        FuncInter1 add = (int x, int y) -> x + y; 
        FuncInter1 multiply = (int x, int y) -> x * y; 
        
        MaiinClass main = new MaiinClass();
        
        System.out.println("part1 is " + main.operate(6, 3, add));   
        System.out.println("part2 is " + main.operate(6, 3, multiply));  
        
        FuncInter2 f2 =(String message) -> System.out.println(message);
        FuncInter2 f3 =(String value) -> System.out.println(value+" - "+value);
        
        main.sayMessage("My name is Hacý Celal Aygar", f2);
        main.sayMessage("33", f3);
        
        FuncInterface fnormal = new FuncInterface() { 
			@Override
			public void abstractFun(int x) { System.out.println(x*x+(x+1)); }
		};
		fnormal.abstractFun(3);
		fnormal.normalFun(); 
	}
    private int operate(int a, int b, FuncInter1 f1) { return f1.operation(a, b); } 
    private void sayMessage(String message,FuncInter2 f2 ) { f2.say(message); }
    interface FuncInter1 { int operation(int a, int b); }
    interface FuncInter2 { void say(String message); } 
}

interface FuncInterface 
{  
    void abstractFun(int x);
    default void normalFun()  {  System.out.println("default method is this.");  } 
} 

//		output :

//		10
//		part1 is 9
//		part2 is 18
//		My name is Hacý Celal Aygar
//		33 - 33
//		13
//		default method is this.