package com.designpatterns.creational.abstractfactory;

public class AWSComputeService implements ComputeService {

	@Override
	public void launchInstance() {
		
        System.out.println("Launching AWS EC2 instance...");
		
	}

}
