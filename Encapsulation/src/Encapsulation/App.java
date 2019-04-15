package Encapsulation;

import TestPackage.Student;

public class App 
{
     public static void main(String[] args) 
	{
		
		String fname=Student.name;
		int fid=Student.id;
		System.out.println("The name and Id is:" +fname +fid);
	}
}