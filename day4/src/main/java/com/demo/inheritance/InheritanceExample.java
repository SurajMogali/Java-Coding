package com.demo.inheritance;

class A {
	int show(int n) {
		return n;

	}
}

class B extends A {
	@Override
	int show(int n) {

		return super.show(n + 10);
	}
}

public class InheritanceExample {
	public static void main(String[] args) {

		B b = new B();
		System.out.println(b.show(10));

	}

}
