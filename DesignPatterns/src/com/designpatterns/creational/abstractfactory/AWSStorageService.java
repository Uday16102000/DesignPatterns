package com.designpatterns.creational.abstractfactory;

public class AWSStorageService  implements StorageService{


	@Override
	public void storeFile(String fileName) {
		
        System.out.println("Uploading " + fileName + " to AWS S3...");
		
	}

}
