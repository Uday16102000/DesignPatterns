package com.designpatterns.creational.abstractfactory;

public class AzureStorageService  implements StorageService{

	@Override
	public void storeFile(String fileName) {
		
        System.out.println("Uploading " + fileName + " to Azure Blob...");
		
	}

}
