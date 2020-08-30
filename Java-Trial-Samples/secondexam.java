package com.example.deneme4.staticUsing;

// Bu kodun çýktýsý nedir ? 
public class secondexam { 
	public static void main(String[] args) { 
		c b1 = new d(); 
		System.out.println("z : "+b1.z);
		b1.play();
		b1.execute();
		
		// output
//		z : 0
//		class d method play
//		class c method execute
		
	} 
} 
class c{
	static int z= 0;
	void play() { System.out.println("class c method play"); } 
	static void execute() { System.out.println("class c method execute"); }
}
class d extends c { 
	static int z= 1; 
	void play() { System.out.println("class d method play"); } 
	static void execute() { System.out.println("class d method execute"); }
}
