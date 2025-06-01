package com.designpatterns.creational.singleton;

public class SingletonTest {
	
	public static void main(String[] args) {

        System.out.println("LazySingleton:");
        LazySingleton.getInstance();

        System.out.println("\nEagerSingleton:");
        EagerSingleton.getInstance();

        System.out.println("\nThreadSafeSingleton:");
        ThreadSafeSingleton.getInstance();

        System.out.println("\nDoubleCheckedSingleton:");
        DoubleCheckedSingleton.getInstance();

        System.out.println("\nBillPughSingleton:");
        BillPughSingleton.getInstance();
	}

}
