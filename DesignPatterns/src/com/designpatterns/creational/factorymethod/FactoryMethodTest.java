package com.designpatterns.creational.factorymethod;

public class FactoryMethodTest {

	public static void main(String[] args) {

		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = notificationFactory.createNotification("sms");
		notification.notifyUser();
	}

}
