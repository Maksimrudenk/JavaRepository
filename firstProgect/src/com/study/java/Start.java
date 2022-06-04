package com.study.java;

public class Start {

	public static void main( String[] args) {
		
		Cat catMurka = new Cat();
		
		catMurka.setName("Murka");
		catMurka.setAge(3);
		
		Dog dogSharik = new Dog();
		
		dogSharik.setName("Sharik");
		dogSharik.setAge(4);
		
		//System.out.println(catMurka.getName() + catMurka.getAge() + "     " + dogSharik.getName() + dogSharik.getAge());
		
		catMurka.voice();
		dogSharik.voice();
	}
	
}
