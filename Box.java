package com.generics;

import java.math.BigDecimal;

class AmazonBox<T> {

	// T stands for "Type"
	private T t;

	public AmazonBox(T t) {
		this.t=t;
	}

	public T get() {
		return t;
	}
	
	public void showBox() {
		System.out.println("*** Inside the Amazon Box is ->"+t);
	}
	
}


public class Box {

	public static void main(String[] args) {

        BigDecimal total = new BigDecimal("0").add(new BigDecimal("5.6")).add(new BigDecimal("5.8"));
        System.out.println(total);
    }
}
