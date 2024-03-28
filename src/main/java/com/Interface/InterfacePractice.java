package com.Interface;

public class InterfacePractice implements B{

	@Override
	public void calculation() {
		System.out.println("calculations");
	}

	@Override
	public void add() {
		System.out.println("add");
	}

	@Override
	public void sub() {
		System.out.println("sub");
	}

	@Override
	public void mul() {
		System.out.println("mul");
	}

	@Override
	public void div() {
		System.out.println("div");
		
	}

	@Override
	public void modulus() {
		System.out.println("modulus");
		
	}

	public static void main(String[] args) {
		InterfacePractice obj=new InterfacePractice();
		obj.calculation();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		obj.modulus();
	}
	
	
}
