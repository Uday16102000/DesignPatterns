package com.designpatterns.creational.abstractfactory;

public class AWSServiceFactory implements CloudServiceFactory{
	@Override
	public ComputeService createComputeService() {
		return new AWSComputeService();
	}

	@Override
	public DatabaseService createDatabaseService() {
		return new AWSDatabaseService();
	}

	@Override
	public StorageService createStorageService() {
		return new  AWSStorageService() ;
	}

}
