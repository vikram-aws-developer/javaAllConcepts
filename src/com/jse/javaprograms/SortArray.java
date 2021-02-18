package com.jse.javaprograms;

public class SortArray {
public static void main(String[] args) {
	
	int num[] = {10,15,88,24,33,99,18,10};
	int temp = 0;
	int secondLarge = 0;
	for(int i =0; i < num.length-1; i++) {
			if(num[i] < num[i+1]) {
				temp = num[i+1];
				secondLarge = num[i];
				System.out.println(secondLarge+"");
			}
			
	}
	System.out.println(secondLarge);
}
}
