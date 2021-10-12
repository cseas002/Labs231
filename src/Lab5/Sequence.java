package Lab5;
/**
 * Sequence Interface (L02, L07)
 * Sequences maintain a collection of items in an extrinsic order, where each item stored has a rank
 * in the sequence, including a first item and a last item. By extrinsic, we mean that the first item is
 * �first�, not because of what the item is, but because some external party put it there. Sequences are
 * generalizations of stacks and queues, which support a subset of sequence operations.
 * Container 	| build(X) 		|given an iterable X, build sequence from items in X
 * 				|len() 			|return the number of stored items
 *--------------------------------------------------------------------------------------------
 * Static 	| iter_seq() 		|return the stored items one-by-one in sequence order
 * 		 	| get_at(i) 		|return the ith item
 * 		 	| set_at(i, x)		|replace the ith item with x
 *--------------------------------------------------------------------------------------------
 * Dynamic 	| insert_at(i, x)	|add x as the ith item
 * 		 	| delete_at(i)		|remove and return the ith item
 * 		 	| insert_first(x)	|add x as the first item
 * 		 	| delete_first()	|remove and return the first item
 * 		 	| insert_last(x)	|add x as the last item
 * 		 	| delete_last()		|remove and return the last item
 * (Note that insert / delete operations change the rank of all items after the modified item.)
 * @author Petros Panayi
 * E --> Iterable Object
 * X --> Item
 * K --> Key
 * @param <E>
 * @param <X>
 * @param <K>
 */
public interface Sequence<E extends Iterable<?>, X extends Number> {
	public void build(E e);				// given an iterable X, build sequence from items in X
	public int len();					// return the number of stored items
//--------------------------------------------------------------------------------------------
	public E iter_seq();				// return the stored items one-by-one in sequence order
	public X get_at(int i);				// return the ith item
	public void set_at(int i, X x);		// replace the ith item with x
//--------------------------------------------------------------------------------------------
	 public void insert_at(int i, X x);	// add x as the ith item
	 public X delete_at(int i);			// remove and return the ith item
	 public void insert_first(X x);		// add x as the first item
	 public X delete_first();			// remove and return the first item
	 public void insert_last(X x);		// add x as the last item
	 public X delete_last();			// remove and return the last itempublic void 
}
