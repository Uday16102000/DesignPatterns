package com.designpatterns.creational.singleton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton threadSafeSingleton;
	
	
	private ThreadSafeSingleton()
	{
		System.out.println("ThreadSafe Singleton Intance Created Successfully");
	}
	
	public static synchronized ThreadSafeSingleton getInstance()
	{
		if(threadSafeSingleton == null)
		{
			threadSafeSingleton = new ThreadSafeSingleton();
			
			
		}
		return threadSafeSingleton;
	}

}
