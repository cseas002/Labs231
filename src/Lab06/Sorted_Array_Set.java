package cy.ac.ucy.cs.epl231.Lab6;

import java.util.ArrayList;
import java.util.List;

public class Sorted_Array_Set <E extends Iterable<X>, X extends Item<K,?>, K extends Comparable<? super K>> implements Set<E, X, K> {
	Sequence<E, X, K> A ;
/*def __init__(self): self.A = Array_Seq() # O(1)	*/
	public Sorted_Array_Set() {
		A = new Array_Seq<>();
	}
/* 	def build(self, X): # O(?)
		self.A.build(X)
		self._sort()
*/
	@Override
	public void build(E e) {
		this.A.build(e);
		this._sort();
	}
	
/* def _sort(self): # O(?)
		??
*/
	private void _sort()	{
		// ???
	}


/*def __len__(self): return len(self.A) 	# O(1)*/
	@Override
	public int len() {
		return this.A.len();
	}
/* def _binary_search(self, k, i, j):	 # O(log n)
		if i >= j: return i
		m = (i + j) // 2
		x = self.A.get_at(m)
		if x.key > k: return self._binary_search(k, i, m - 1)
		if x.key < k: return self._binary_search(k, m + 1, j)
		return m
*/
	private int _binary_search(K k, int i, int j) {
		/*** ADD YOUR CODE HERE ***/
		return 0;
	}
/* 	def find(self, k): 					# O(log n)
		if len(self) == 0: return None
		i = self._binary_search(k, 0, len(self) - 1)
		x = self.A.get_at(i)
		if x.key == k: return x
		else: return None
*/
	@Override
	public X find(K key) {
		/*** ADD YOUR CODE HERE ***/
		return null;
	}
/*	def insert(self, x): 					# O(n)
		if len(self.A) == 0:
			self.A.insert_first(x)
		else:
			i = self._binary_search(x.key, 0, len(self.A) - 1)
			k = self.A.get_at(i).key
			if k == x.key:
				self.A.set_at(i, x)
				return False
			if k > x.key: self.A.insert_at(i, x)
			else: self.A.insert_at(i + 1, x)
		return True
*/
	@Override
	public void insert(X x) {
		/*** ADD YOUR CODE HERE ***/
	}
/* 	def delete(self, k): 					# O(n)
		i = self._binary_search(k, 0, len(self.A) - 1)
		assert self.A.get_at(i).key == k
		return self.A.delete_at(i)
*/
	@Override
	public X delete(K key) {
		/*** ADD YOUR CODE HERE ***/
		return null;
	}
/*def iter_order(self): yield from self 		# O(n)*/
	@Override
	public E iter_ord() {
		return (E) A.iter_seq();
	}
	/*def find_min(self):
	out = None
	for x in self:
		if (out is None) or (x.key < out.key):
			out = x
	return out
*/
@Override
public X find_min() {
	/*** ADD YOUR CODE HERE ***/
	return null;
}
/*	def find_max(self):
	out = None
	for x in self:
		if (out is None) or (x.key > out.key):
			out = x
return out
*/
@Override
public X find_max() {
	/*** ADD YOUR CODE HERE ***/
	return null;
}
/* def find_next(self, k): # O(log n)
		if len(self) == 0: return None
		i = self._binary_search(k, 0, len(self) - 1)
		x = self.A.get_at(i)
		if x.key > k: return x
		if i + 1 < len(self): return self.A.get_at(i + 1)
		else: return None
*/
	@Override
	public X find_next(K key) {
		/*** ADD YOUR CODE HERE ***/
		return null;
	}
/*	def find_prev(self, k): 				# O(log n)
		if len(self) == 0: return None
		i = self._binary_search(k, 0, len(self) - 1)
		x = self.A.get_at(i)
		if x.key < k: return x
		if i > 0: return self.A.get_at(i - 1)
		else: return None
*/
	@Override
	public X find_prev(K key) {
		/*** ADD YOUR CODE HERE ***/
		return null;
	}

	// Removes and returns a Sorted_Array_Set<E,X,K>
	// from item "from" to item "to" if both exist else null
	public Sorted_Array_Set<E,X,K> remove_subarray(K from, K to){
		/*** ADD YOUR CODE HERE ***/
		return null;
	}
	public static void main(String[] args) {
		// At this point we need to create an Interable with 
		// some data in order to build the Sorted_Array_Set
		List<Item<Integer,Integer>> data = new ArrayList<>();
		// Items are interned sorted in Lab6		
		data.add(new Item<Integer,Integer>(0,0));
		data.add(new Item<Integer,Integer>(11,11));
		data.add(new Item<Integer,Integer>(22,22));
		data.add(new Item<Integer,Integer>(33,33));
		data.add(new Item<Integer,Integer>(44,44));
		data.add(new Item<Integer,Integer>(55,55));
		data.add(new Item<Integer,Integer>(66,66));
		data.add(new Item<Integer,Integer>(77,77));
		data.add(new Item<Integer,Integer>(88,88));
		data.add(new Item<Integer,Integer>(99,99));
		Sorted_Array_Set<List<Item<Integer,Integer>>, Item<Integer,Integer>, Integer> sas = new Sorted_Array_Set<>();
		sas.build(data);
		for(Object a: sas.iter_ord()) 
			System.out.print(a+",");
		System.out.println();
		
//		System.out.println(sas.find(55));
//		System.out.println(sas.find_max());
//		System.out.println(sas.find_min());
//		System.out.println(sas.find_next(55));
//		System.out.println(sas.find_prev(55));
//		
//		System.out.println("\nDelete 55:"+sas.delete(55));
//		for(Object a: sas.iter_ord()) 
//			System.out.print(a+",");
//		
//		sas.insert(new Item<Integer,Integer>(45,45));
//		System.out.println();
//		for(Object a: sas.iter_ord()) 
//			System.out.print(a+",");
		
		
		// Remove a sub-Array from sas
		/*System.out.println();
		for(Object a: sas.remove_subarray(33,77).iter_ord()) 
			System.out.print(a+",");
		System.out.println();
		System.out.println();
		for(Object a: sas.iter_ord()) 
			System.out.print(a+",");
		System.out.println();
		*/
	}

}
