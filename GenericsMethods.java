package com.generics;

public class GenericsMethods {

	
		//Generics in method
		public static <T> boolean isEqual(GenType<T> g1, GenType<T> g2){
			return g1.getT().equals(g2.getT());
		}
		
		public static <T extends Comparable<T>> int compare(T t1, T t2){
			return t1.compareTo(t2);
		}
		
		public static void main(String args[]){
			GenType<String> g1 = new GenType<>();
			g1.setT("demo");
			GenType<String> g2 = new GenType<>();
			g2.setT("demo");
			boolean isEqual = GenericsMethods.isEqual(g1, g2);
			System.out.println(isEqual);
			 
		}
		
		
}
