package com.designpatterns.creational.abstractfactory;

public class AzureComputeService  implements ComputeService{

	@Override
	public void launchInstance() {
		
        System.out.println("Launching Azure VM...");
		
	}

}
