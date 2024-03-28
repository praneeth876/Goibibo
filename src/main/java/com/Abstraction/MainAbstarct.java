package com.Abstraction;

public class MainAbstarct {

	
	public static void main(String[] args) {
		Abstraction i1=new AbstractionImplementation();
		
		AbstractionImplementation i= (AbstractionImplementation)i1;
		i.listenSongs();
		i.practiceSelenium();
		i.singing();
		i.play();
		System.out.println(i.a);
		Abstraction.a=20;
	}
}
