package com.designpatterns.creational.abstractfactory;

public class CloudClient {
	public static void main(String[] args) {
		
		CloudServiceFactory factory = new AWSServiceFactory(); // or new AzureServiceFactory()
		ComputeService compute = factory.createComputeService();
		StorageService storage = factory.createStorageService();
		DatabaseService database = factory.createDatabaseService();

		compute.launchInstance();
		storage.storeFile("report.pdf");
		database.createDatabase("customerDB");
	}

}
