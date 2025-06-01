package com.designpatterns.creational.factorymethod;

public class SmsNotification implements Notification{

	@Override
	public void notifyUser() {
		System.out.println("SMS Notification Send To User");
		
	}

}
