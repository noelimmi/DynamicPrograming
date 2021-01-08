//$Id$
package com.immi;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	private Map<Integer,Long>memo = new HashMap();
	
	//Time Complexity - O(2**n)
	//Space Complexity - O(n)
	//recursion (grows exponentially)
	public Long fibo(long n) {
		if (n <= 2) return 1L;
		return fibo(n-1) + fibo(n-2);
	}
	
	//Time Complexity - O(n)
	//Space Complexity - O(n)
	//memoization (O(2**n) -> O(n))
	public Long fiboMemo(Integer n) {
		if (memo.containsKey(n)) return memo.get(n);
		if (n <= 2) return 1L;
		memo.put(n,fiboMemo(n-1) + fiboMemo(n-2));
		return memo.get(n);
	}
}
