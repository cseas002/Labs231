package Lab06;

/**
 * 
 * Set Interface (L03-L08)
 * By contrast, Sets maintain a collection of items based on an intrinsic property involving what the
 * items are, usually based on a unique key, x.key, associated with each item x. Sets are generalizations
 * of dictionaries and other intrinsic query databases.
 * Container 	| build(X)	|given an iterable X, build set from items in X
 * 				| len() 	|return the number of stored items
 * --------------------------------------------------------------------------------------------
 * Static		| find(k) 	|return the stored item with key k
 * --------------------------------------------------------------------------------------------
 * Dynamic 	|insert(x) 		|add x to set (replace item with key x.key if one already exists)
 * 			|delete(k) 		|remove and return the stored item with key k
 * --------------------------------------------------------------------------------------------
 * Order 	|iter_ord() 	|return the stored items one-by-one in key order
 * 		 	|find_min() 	|return the stored item with smallest key
 * 	 		|find_max() 	|return the stored item with largest key
 * 		 	|find_next(k) 	|return the stored item with smallest key larger than k
 * 		 	|find_prev(k) 	|return the stored item with largest key smaller than k
 * 		 	
 * @author admin
 *
 * @param <E>
 * @param <X>
 * @param <K>
 */

public interface Set<E extends Iterable<?>, X extends Item<K,?>, K extends Comparable<? super K>> {
	void build(E e);		// given an iterable X, build set from items in X
	int len();	 		//return the number of stored items
//-- Static  ---------------------------------------------------------------------------------
X find(K key);		//return the stored item with key k
//-- Dynamic ---------------------------------------------------------------------------------
void insert(X x); 	//add x to set (replace item with key x.key if one already exists)
	X delete(K key); 	//remove and return the stored item with key k
//--- Order  ---------------------------------------------------------------------------------
E iter_ord(); 		//return the stored items one-by-one in key order
	X find_min(); 		//return the stored item with the smallest key
	X find_max(); 		//return the stored item with the largest key
	X find_next(K key); 	//return the stored item with the smallest key larger than k
	X find_prev(K key); 	//return the stored item with the largest key smaller than k
}
