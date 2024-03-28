package com.PracticeSelenium;

public class ConstructorTask {
String name;
int age;

public static void staticMethod() {
	System.out.println("Static");
}
public void nonStaticMethod() {
	System.out.println(name+" "+age);
}

	ConstructorTask(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public static void main(String[] args) {
		ConstructorTask ct=new ConstructorTask("Praneeth",25);
		ct.nonStaticMethod();
		staticMethod();
		
	}
	
}
