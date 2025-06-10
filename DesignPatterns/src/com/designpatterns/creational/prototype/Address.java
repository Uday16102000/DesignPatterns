package com.designpatterns.creational.prototype;

public class Address implements Cloneable {
	
	 String city;

	public Address(String city) {
		this.city = city;
	}

	@Override
	protected Address clone() throws CloneNotSupportedException {

		return (Address) super.clone();

	}

}
