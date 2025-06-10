package com.designpatterns.creational.prototype;

public class Person implements Cloneable {

	String name;
	Address address;

	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	protected Person clone() throws CloneNotSupportedException
	{
		return (Person)super.clone(); // Shallow clone by default
	}
	

	// ✅ To make deep clone, uncomment below:

//      protected Person clone() throws CloneNotSupportedException 
//		{
//			Person cloned = (Person) super.clone();
//			cloned.address = address.clone(); // 🔁 Deep clone of nested object
//			return cloned;
//		}

}
