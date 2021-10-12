package Lab06;

import java.util.ArrayList;
import java.util.List;

public class Sorted_Array_Set<E extends Iterable<X>, X extends Item<K, ?>, K extends Comparable<? super K>> implements Set<E, X, K> {
    Sequence<E, X, K> A;

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
    private void _sort() {
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
        if (i >= j)
            return i;
        int m = (i + j) / 2;
        X x = this.A.get_at(m);
        if (x.key.compareTo(k) > 0)
            return this._binary_search(k, i, m - 1);
        if (x.key.compareTo(k) < 0)
            return this._binary_search(k, m + 1, j);
        return m;
    }

    /* 	def find(self, k): 					# O(log n)
            if len(self) == 0: return None
            i = self._binary_search(k, 0, len(self) - 1)
            x = self.A.get_at(i)
            if x.key == k: return x
            else: return None
    */
    @Override
    public X find(K k) {
        if (this.len() == 0)
            return null;
        int i = this._binary_search(k, 0, this.len() - 1);
        X x = this.A.get_at(i);
        if (x.key == k)
            return x;
        else
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
        if (this.A.len() == 0)
            this.A.insert_first(x);
        else {
            int i = this._binary_search(x.key, 0, this.A.len() - 1);
            K k = this.A.get_at(i).key;
            if (k.compareTo(x.key) == 0) {
                this.A.set_at(i, x);
                return;
            }
            if (k.compareTo(x.key) > 0)
                this.A.insert_at(i, x);
            else
                this.A.insert_at(i + 1, x);
        }
    }

    /* 	def delete(self, k): 					# O(n)
            i = self._binary_search(k, 0, len(self.A) - 1)
            assert self.A.get_at(i).key == k
            return self.A.delete_at(i)
    */
    @Override
    public X delete(K k) {
        int i = this._binary_search(k, 0, this.A.len() - 1);
        assert this.A.get_at(i).key == k;
        return this.A.delete_at(i);
    }

    /*def iter_order(self): yield from self 		# O(n)*/
    @Override
    public E iter_ord() {
        return A.iter_seq();
    }


    /*def find_min(self):
        return self.A.get_at(0)
*/
    @Override
    public X find_min() {
        return this.A.get_at(0);
    }

    /*	def find_max(self):
            return self.A.get_at(len(self) - 1)
    */
    @Override
    public X find_max() {
        return this.A.get_at(this.len() - 1);
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
    public X find_next(K k) {
        if (this.len() == 0)
            return null;
        int i = this._binary_search(k, 0, this.len() - 1);
        X x = this.A.get_at(i);
        if (x.key.compareTo(k) > 0)
            return x;
        if (i + 1 < this.len())
            return this.A.get_at(i + 1);
        else
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
    public X find_prev(K k) {
        if (this.len() == 0)
            return null;
        int i = this._binary_search(k, 0, this.len() - 1);
        X x = this.A.get_at(i);
        if (x.key.compareTo(k) < 0)
            return x;
        if (i > 0)
            return this.A.get_at(i - 1);
        else
            return null;
    }

    // Removes and returns a Sorted_Array_Set<E,X,K>
    // from item "from" to item "to" if both exist else null
    public Sorted_Array_Set<E, X, K> remove_subarray(K from, K to) {
        if (this.find(from) == null || this.find(to) == null)
            return null;

        X x = find(from);
        int i = 0;

        Sorted_Array_Set<E, X, K> newSortedArraySet = new Sorted_Array_Set<>();
        while (x.key.compareTo(to) <= 0) {
            newSortedArraySet.insert(x);
            this.delete(x.key);
            x = this.find_next(x.key);
        }
        return newSortedArraySet;
    }

    public static void main(String[] args) {
        // At this point we need to create an Iterable with
        // some data in order to build the Sorted_Array_Set
        List<Item<Integer, Integer>> data = new ArrayList<>();
        // Items are interned sorted in Lab6
        data.add(new Item<>(0, 0));
        data.add(new Item<>(11, 11));
        data.add(new Item<>(22, 22));
        data.add(new Item<>(33, 33));
        data.add(new Item<>(44, 44));
        data.add(new Item<>(55, 55));
        data.add(new Item<>(66, 66));
        data.add(new Item<>(77, 77));
        data.add(new Item<>(88, 88));
        data.add(new Item<>(99, 99));
        Sorted_Array_Set<List<Item<Integer, Integer>>, Item<Integer, Integer>, Integer> sas = new Sorted_Array_Set<>();
        sas.build(data);
        for (Object a : sas.iter_ord())
            System.out.print(a + ",");
        System.out.println();

        System.out.println(sas.find(55));
        System.out.println(sas.find_max());
        System.out.println(sas.find_min());
        System.out.println(sas.find_next(55));
        System.out.println(sas.find_prev(55));

        System.out.println("\nDelete 55: " + sas.delete(55));
        for (Object a : sas.iter_ord())
            System.out.print(a + ",");

        System.out.println("\n\nInsert 45:45: " + sas.delete(55));
        sas.insert(new Item<>(45, 45));
        for (Object a : sas.iter_ord())
            System.out.print(a + ",");


        // Remove a sub-Array from sas
        System.out.println("\n\nRemoving sub array from 33 to 77:");
        for (Object a : sas.remove_subarray(33, 77).iter_ord())
            System.out.print(a + ",");
        System.out.println();
        for (Object a : sas.iter_ord())
            System.out.print(a + ",");
        System.out.println();

    }

}
