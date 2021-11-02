package Lab9;

import java.util.ArrayList;
import java.util.List;


public class Hash_Table<E extends Iterable<X>, X extends Item<K, ?>, K extends Comparable<? super K>> {
	Sequence<E, X, K> A[];
	int HT_SIZE;
	int size;

	public Hash_Table(int size) {
		HT_SIZE = size;
		A = new Sequence[size];
	}

	private int _hash(int k) {
		/** ADD YOUR CODE HERE **/
		return 0;
	}

	public void insert(X x) {
		/** ADD YOUR CODE HERE **/
	}

	public X find(K key) {
		/** ADD YOUR CODE HERE **/
		return null;
	}

	public E iter_ord() {
		List<X> data = new ArrayList<X>();
		/** ADD YOUR CODE HERE **/
		return (E) data;
	}

	private int _hashB(int k, int c) {
		int h = (Math.abs((10 * k + 4) % c) % HT_SIZE);
		return h;
	}

	void partBCollitionTest(Hash_Table<E, X, K> ht) {
		/** ADD YOUR CODE HERE **/
	}

	public static void main(String[] args) {
		Hash_Table<List<Item<Integer, Integer>>, Item<Integer, Integer>, Integer> ht = new Hash_Table<>(7);
		ht.insert(new Item<Integer, Integer>(47, 47));
		ht.insert(new Item<Integer, Integer>(61, 61));
		ht.insert(new Item<Integer, Integer>(36, 36));
		ht.insert(new Item<Integer, Integer>(52, 52));
		ht.insert(new Item<Integer, Integer>(56, 56));
		ht.insert(new Item<Integer, Integer>(33, 33));
		ht.insert(new Item<Integer, Integer>(92, 92));
		System.out.println(ht.find(33));
		for (Object a : ht.iter_ord())
			System.out.print(a + ",");
		System.out.println("");
		ht.partBCollitionTest(ht);
	}
}
