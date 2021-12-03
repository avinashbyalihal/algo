package com.enumexample;

public enum Colors implements Color{
  RED,YELLOW,BLUE;
	
	@Override
	public String fetchName() {
		return this.name();
	}

}
