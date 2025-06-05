package com.designpatterns.creational.buillder;

public class BuilderTest {
public static void main(String[] args) {
	
	User user = new User.Builder("Uday", "More").age(25).email("udaymore437@gmail.com").country("India").build();
	System.out.println(user.toString());
	
}
}
