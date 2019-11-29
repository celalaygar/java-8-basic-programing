package com.example.UsageSet;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;


public class UsingVector {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>(3,6);
		System.out.println(vector.capacity());					// 3
		vector.add("Ankara");
		vector.add("�zmir");
		vector.add("�stanbul");
		vector.add("Adana");
		vector.add("Van");
		System.out.println(vector);								// [Ankara, �zmir, �stanbul, Adana, Van]
		System.out.println(vector.capacity());					// 9
		
		Iterator<String> iterators = vector.iterator();
		System.out.println("\nIterator");
		while (iterators.hasNext()) {
			System.out.print(iterators.next()+",");				// Ankara,�zmir,�stanbul,Adana,Van,
		}
		
		Enumeration<String> enumeration = vector.elements();
		System.out.println("\nEnumeration");
		while (enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement()+",");	// Ankara,�zmir,�stanbul,Adana,Van,
			
		}
		
		
	}

}
