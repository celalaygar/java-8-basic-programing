package proje3.SingletonPattern;

public class AnyObject {
	   private static AnyObject anyData_1 = new AnyObject();
	   private AnyObject(){
		   
	   }
	   public static AnyObject getData(){
	      return anyData_1;
	   }
	   public void getMessage(){
	      System.out.println("Hello World! I'm AnyObject ");
	   }
}
