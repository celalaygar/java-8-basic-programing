package aaa.com.celal.reflection_2;

public class Test {
    private String s; 
    private int value;
    public Test()  {  s = "Test class for Reflection"; } 
  
    public void method1()  { 
        System.out.println("The string is " + s); 
    } 
  
    public void method2(int x,int y)  { 
        System.out.println("The number is (x+y) " + (x+y)); 
    } 
  
    private void method3() { 
        System.out.println("Private method invoked 1"); 
    }
    
    private void method4(int n) { 
        System.out.println("Private method invoked 2 " + n); 
    }

    private String method5(String data) { 
        System.out.println("Private method invoked in string " + data); 
        return data;
    }
    private int method6(int data) { 
        System.out.println("Private method invoked in int " + (data*data)); 
        return data;
    }
    public void method7()  { 
        System.out.println("The int is " + value); 
    }
    
    class innerTest{
    	private String name;
    	private int value;

        public innerTest()  {  name = "innerTest class for Reflection"; } 
        
        public void method1()  { 
            System.out.println("innerTest name is " + name); 
        }
        public void method2(int x,int y)  { 
            System.out.println("innerTest number is (x+y) " + (x+y)); 
        }
        private int method6(int data) { 
            System.out.println("innerTest Private method invoked in int " + (data*data)); 
            return data;
        }
        public void method7()  { 
            System.out.println("innerTest value is " + value); 
        }
    }
    
}
