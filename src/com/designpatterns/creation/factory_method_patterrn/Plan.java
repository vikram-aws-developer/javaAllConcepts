package com.designpatterns.creation.factory_method_patterrn;

abstract class Plan {

	double rate;
	
	abstract void getRate();
	
	public void calculateBill(int units) {
		System.out.println(units*rate);
	}
}
