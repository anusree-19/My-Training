package com;

public class Test implements Printable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.display();
		Printable1 r=new Test();
		r.print();

	}
	public void print()
	{
		System.out.println("hello");
	}

	public void display()
	{
		System.out.println("Example of interfece");
	}
}
