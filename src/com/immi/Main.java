//$Id$
package com.immi;

public class Main {
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		System.out.println(fib.fiboMemo(6));
		System.out.println(fib.fiboMemo(7));
		System.out.println(fib.fiboMemo(50));
	}
}
