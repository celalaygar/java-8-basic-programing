package com.example.deneme4.staticUsing;

public class firstexam {
	public static void main(String[] args) {
		b b1 = new b(); 
		System.out.println("z : "+b1.z);
		b1.play();
		b1.execute();
		
		// output
//		z : 1
//		class b method play
//		class b method execute
	} 
}
class a{
	static int z= 0;
	void play() { System.out.println("class a method play"); } 
	static void execute() { System.out.println("class a method execute"); }
}
class b extends a { 
	static int z= 1; 
	void play() { System.out.println("class b method play"); } 
	static void execute() { System.out.println("class b method execute"); }
}
