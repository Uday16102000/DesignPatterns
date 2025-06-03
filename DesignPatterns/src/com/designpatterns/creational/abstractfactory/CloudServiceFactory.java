package com.designpatterns.creational.abstractfactory;

public interface CloudServiceFactory {
	ComputeService createComputeService();
	DatabaseService createDatabaseService();
	StorageService createStorageService();

}
