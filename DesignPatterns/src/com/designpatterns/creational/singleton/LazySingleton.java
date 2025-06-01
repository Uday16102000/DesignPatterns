package com.designpatterns.creational.singleton;

public class LazySingleton {
	
	private static LazySingleton lazySingleton;
	
	private LazySingleton()
	{
		System.out.println("Lazy Singleton Instance Created");
	}
	
	public static LazySingleton getInstance()
	{
		if(lazySingleton == null)
		{
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}

}
