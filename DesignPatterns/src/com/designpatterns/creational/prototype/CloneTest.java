package com.designpatterns.creational.prototype;

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("Mumbai");
		Person original = new Person("Uday", address);

		Person shallowClone = original.clone();
		shallowClone.address.city = "Pune";

		System.out.println("Original's City: " + original.address.city);
		System.out.println("Clone's City: " + shallowClone.address.city);

	}

}
