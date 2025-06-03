package com.designpatterns.creational.abstractfactory;

public class AzureDatabaseService implements DatabaseService {

	@Override
	public void createDatabase(String databaseName) {
		
        System.out.println("Creating Azure SQL Database: " + databaseName);
		
	}

}
