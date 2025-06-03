package com.designpatterns.creational.abstractfactory;

public class AzureServiceFactory  implements CloudServiceFactory{

	@Override
	public ComputeService createComputeService() {
		return new AzureComputeService();
	}

	@Override
	public DatabaseService createDatabaseService() {
		return new AzureDatabaseService();
	}

	@Override
	public StorageService createStorageService() {
		return new  AzureStorageService() ;
	}

}
