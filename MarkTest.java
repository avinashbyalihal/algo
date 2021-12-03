package com.enumexample;

public class MarkTest {

	public static void main(String[] args) {
	    MarkTest.showColor(Colors.BLUE);
	  }

	  private static void showColor(Color c) {
	    System.out.println(c.fetchName());
	  }
}
