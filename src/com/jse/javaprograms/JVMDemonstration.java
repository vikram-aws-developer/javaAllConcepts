package com.jse.javaprograms;

import java.lang.reflect.*;

class Student
{
	private String studentName;
	private int studentID;
	private String studentAddress;
	
	void display() {
		System.out.println("Display student information");
	}
	
	void studentAddress() {
		System.out.println("student address");
	}
	
	void studentCollege() {
		System.out.println("student collegue");
	}
	
	
}


public class JVMDemonstration {
	public static void main(String[] args) {
		
		//Creating student object with the help of new operator
		Student studentObj = new Student();
		
		//getting hold of class object created by JVM
		Class classObj=studentObj.getClass();
		
		//Now print the type of the object which is going to store in the Heap memory 
		System.out.println("Type of .class generated is :\t"+classObj.getName());
		
		
		//lets get all the methods declared in Student class
		Method method[]=classObj.getDeclaredMethods();
		
		for(Method methodsList: method) {
			System.out.println(methodsList.getName());
		}
		
		// printing all the variables and its datatype in the Studetent class
		Field fileds[]=classObj.getDeclaredFields();
		for(Field fieldsList:fileds) {
			System.out.println(fieldsList.getName()+"is of datatype :\t"+fieldsList.getGenericType());
			
		}
		
	}

}
