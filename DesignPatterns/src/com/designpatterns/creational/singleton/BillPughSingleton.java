package com.designpatterns.creational.singleton;

public class BillPughSingleton {
	public BillPughSingleton()
	{
		System.out.println("Bill Pugh Singleton Instance Created Successfully");
	}
	
    // Static nested class - Loaded only when getInstance() is called
	private static class SingletonHelper
	{
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance()
	{
		return SingletonHelper.INSTANCE;
	}

}