package com.sample;

public class ArmStrong {

	public static void main(String[] args) {
	
		Integer input = 345346346;
		int length = input.toString().length();
		char[] data = input.toString().toCharArray();
		
		Integer finalValue =0;
		for(int j = 0; j<input.toString().length(); j++) {
			System.out.println(data[j]);
			char val = data[j];
			Integer intVal = Integer.valueOf(String.valueOf(val));
			Integer innerFinalVal = 1;
			for(int i=1;i<=length;i++) {
				System.out.println("intVal : "+intVal);
				System.out.println("before multiply innerFinalVal : "+innerFinalVal);
				innerFinalVal = innerFinalVal*intVal;
				System.out.println("after multiply innerFinalVal : "+innerFinalVal);
			}
			finalValue = finalValue + innerFinalVal;
			
			System.out.println("loop finalValue : "+finalValue);
		}
		System.out.println(finalValue);
		System.out.println(input);
		
		if(input.equals(finalValue)) {
			System.out.println("armStrong");
		}else {
			System.out.println("not armStrong");
		}
	
	}

}

