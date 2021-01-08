## Memoization Recipe

* Make it work 
	* visualise as tree (node - problem edge-shrinking size of problem)
	* implement the tree using recursion (have base cases and call recursive manner)
	* test it
* Make it efficient 
	* add a memo object (key-input,value-result, memo object should be shared across function call stack)
	* add a new base class to return memo result
	* store return values into the memo
