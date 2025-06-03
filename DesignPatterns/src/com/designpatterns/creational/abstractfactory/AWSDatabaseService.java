package com.designpatterns.creational.abstractfactory;

public class AWSDatabaseService  implements DatabaseService
{

	@Override
	public void createDatabase(String databaseName) {
		
        System.out.println("Creating RDS database: " + databaseName);
		
	}

}
