package com.mii.oop.basic;

public class MainClass {

	public static void main(String[] args) {
		String nama;
		nama="femi";
		
		Animal dog=new Animal();
		Animal dog2=new Animal();
		
		dog.jenis_anjing="herder";
		dog2.jenis_anjing="siberian husky";
		
		dog.bark();
		System.out.println(dog.jenis_anjing);
		System.out.println(dog2.jenis_anjing);
		
	}
}
