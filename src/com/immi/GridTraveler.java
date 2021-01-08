//$Id$
package com.immi;

import java.util.HashMap;
import java.util.Map;

public class GridTraveler {
	
	private Map<String, Long> memo = new HashMap<>();
	
	int i = 0;
	
	public Map<String, Long> getMemo() {
		return memo;
	}
	
	
	/**
	 * gridTraveler(m,n) == gridTraveler(n,m)
	 * O(n*m) Time Complexity (will be reduced by half) 
	 * O(n+m) Space Complexity
	**/
	public Long getTotalNumberOfWaysMemoized2(Long m , Long n , Map<String, Long>memo) {
		i++;
		String key = m + "," + n;
		String rKey = n + "," + m;
		if(memo.containsKey(key)) return memo.get(key);
		if(memo.containsKey(rKey)) return memo.get(rKey);
		if(m == 1 && n == 1) return 1L;
		if(m == 0 || n == 0) return 0L;
		memo.put(m +","+ n, getTotalNumberOfWaysMemoized2(m-1,n,memo) + getTotalNumberOfWaysMemoized(m,n-1,memo));
		memo.put(n +","+ m, getTotalNumberOfWaysMemoized(m,n-1,memo) + getTotalNumberOfWaysMemoized(m-1,n,memo));
		return memo.get(key);
	}
		


	//O(n*m) Time Complexity 
	//O(n+m) 	Space Complexity
	public Long getTotalNumberOfWaysMemoized(Long m , Long n , Map<String, Long>memo) {
		i++;
		String key = m + "," + n;
		if(memo.containsKey(key)) return memo.get(key);
		if(m == 1 && n == 1) return 1L;
		if(m == 0 || n == 0) return 0L;
		memo.put(m +","+ n, getTotalNumberOfWaysMemoized(m-1,n,memo) + getTotalNumberOfWaysMemoized(m,n-1,memo));
		return memo.get(key);
	}
	
	
	
	//O(2**n+m) Time Complexity 
	//O(n+m) 	Space Complexity
	public Long getTotalNumberOfWays(Long m , Long n) {
		if(m == 1 && n == 1) return 1L;
		if(m == 0 || n == 0) return 0L;
		return getTotalNumberOfWays(m-1,n) + getTotalNumberOfWays(m,n-1);
	}

	
	public static void main(String[] args) {
		GridTraveler gt = new GridTraveler();
		System.out.println(gt.getTotalNumberOfWaysMemoized2(18L, 18L,gt.getMemo()));
		System.out.println(gt.getMemo().size());
		System.out.println(gt.i+"");
	}


}
