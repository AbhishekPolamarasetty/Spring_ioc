package com.example.inversion_control;

public class OnePlus implements Mobiles {
	OnePlus(){
		System.out.println("Oneplus constructor is triggered");
	}
	@Override
	public void getModelAndColor() {
		System.out.println("Model : 13");

	}

}
