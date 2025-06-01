package com.designpatterns.creational.singleton;

public class EagerSingleton {
	
	private static final EagerSingleton eagerSingleton = new EagerSingleton();
	
	private EagerSingleton()
	{
	System.out.println("Eager Singleton Instance Created Successfully");
	}
	
	public static EagerSingleton getInstance()
	{
		return eagerSingleton;
	}

}
