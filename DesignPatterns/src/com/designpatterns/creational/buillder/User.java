package com.designpatterns.creational.buillder;

public class User {
	// Required
	private String firstName;
	private String lastName;

	// Optional
	private int age;
	private String country;
	private String email;
	private boolean isVerified;
	private boolean isSubscribed;

	private User(Builder builder)

	{
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.email = builder.email;
		this.country = builder.country;
		this.isVerified = builder.isVerified;
		this.isSubscribed = builder.isSubscribed;

	}

	public static class Builder {

		private final String firstName;
		private final String lastName;

		private int age;
		private String country;
		private String email;
		private boolean isVerified;
		private boolean isSubscribed;

		public Builder(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder country(String country) {
			this.country = country;
			return this;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder isVerified(boolean isVerified) {
			this.isVerified = isVerified;
			return this;
		}

		public Builder isSubscribed(boolean isSubscribed) {
			this.isSubscribed = isSubscribed;
			return this;
		}

		public User build() {
			return new User(this);
		}

	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", country=" + country
				+ ", email=" + email + ", isVerified=" + isVerified + ", isSubscribed=" + isSubscribed + "]";
	}

}
