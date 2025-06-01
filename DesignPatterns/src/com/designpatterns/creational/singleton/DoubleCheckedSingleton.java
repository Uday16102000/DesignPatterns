package com.designpatterns.creational.singleton;

public class DoubleCheckedSingleton {
	
	private static DoubleCheckedSingleton doubleCheckedSingleton;
	
	public DoubleCheckedSingleton()
	{
		System.out.println("DoubleChecked Singleton Instance Created Successfully");
	}
	
	public static DoubleCheckedSingleton getInstance()
	{
		if(doubleCheckedSingleton == null) {
			synchronized (DoubleCheckedSingleton.class) {
				doubleCheckedSingleton = new DoubleCheckedSingleton();
				
			}
		}
		return doubleCheckedSingleton;
	}

}
