package com.designpatterns.creational.factorymethod;

public class NotificationFactory {

	public Notification createNotification(String type) {
		if (type == null || type.isEmpty())
			return null;

		switch (type.toLowerCase()) {
		case "sms":

			return new SmsNotification();

		case "email":
			return new EmailNotification();

		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}

}
