
package com.generics;

class Bound<T extends Fox & Dog> {

	private T objRef;

	public Bound(T obj) {
		this.objRef = obj;
	}

	public void doRunTest() {
		this.objRef.displayClass();
	}
}

interface Dog {
	public void displayClass();
}

class Fox implements Dog {
	public void displayClass() {
		System.out.println("Inside super class Fox");
	}
}

public class BoundedClass {
	
	public static void main(String a[]) {  
		Bound<Fox> t = new Bound<Fox>(new Fox());
		t.doRunTest();
		
  }
}
