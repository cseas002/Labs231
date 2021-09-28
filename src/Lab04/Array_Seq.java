package Lab04;

import java.util.ArrayList;
import java.util.List;

class Array_Seq<E extends Iterable<X>, X extends Number> implements Sequence<E, X> {
	protected X[] A;  
	int size;
	
/*def __init__(self): # O(1)
	self.A = []
	self.size = 0 	
*/
	public Array_Seq() {
		this.A = (X[]) new Number[0];
		this.size = 0;
	}
	public Array_Seq(int n) {
		this.A = (X[]) new Number[n];
		this.size = 0;
	}
/*def build(self, X): # O(n)
	self.A = [a for a in X] # pretend this builds a static array
	self.size = len(self.A)
*/
	@Override
	public void build(E e) {
		int i = 0;for(X a: e)	i++;
		this.A = (X[]) new Number[i+1];
		for(X a: e){
			this.A[size] = a;
			this.size++;
		}		
	}
/* def __len__(self): return self.size */
	@Override
	public int len() {
		return this.size;
	}

	// return the stored items one-by-one in sequence order
	@Override
	public E iter_seq() {
		List<X> data = new ArrayList<>();
		for(int i =0; i<this.len();i++)
			data.add(this.A[i]);
		return (E) data;
	}
	
	// def get_at(self, i): return self.A[i] # O(1)
	@Override
	public X get_at(int i) {return this.A[i];}

	// def set_at(self, i, x): self.A[i] = x # O(1)
	@Override
	public void set_at(int i, X x) {this.A[i] = x;}


/*	def insert_at(self, i, x): # O(n)
		n = len(self)
		A = [None] * (n + 1)
		self._copy_forward(0, i, A, 0)
		A[i] = x
		self._copy_forward(i, n - i, A, i + 1)
		self.build(A)
*/
	@Override
	public void insert_at(int i, X x) {
		int n = len();
		X[] A = (X[]) new Number[n+1];
		this._copy_forward(0, i, A, 0);
		A[i] = x;
		this._copy_forward(i, n - i, A, i + 1);
		this.size++;
		this.A = A;
	}

/*	def delete_at(self, i):
 		n = len(self)
		A = [None] * (n - 1)
		self._copy_forward(0, i, A, 0)
		x = self.A[i]
		self._copy_forward(i + 1, n - i - 1, A, i)
		self.build(A)
		return x
 */
	@Override
	public X delete_at(int i) {
		int n = this.len();
		X[] A = (X[]) new Number[n-1];
		this._copy_forward(0, i, A, 0);
		X x = this.A[i];
		this._copy_forward(i + 1, n - i - 1, A, i);
		this.size--;
		this.A = A;
		return x;
	}

/*def insert_first(self, x): self.insert_at(0, x)*/
	@Override
	public void insert_first(X x) {
		this.insert_at(0, x);
		
	}
/*def delete_first(self): return self.delete_at(0)*/
	@Override
	public X delete_first() {return this.delete_at(0);}

/*def insert_last(self, x): self.insert_at(len(self), x)*/
	@Override
	public void insert_last(X x) {this.insert_at(this.len(), x);}


/*def delete_last(self): return self.delete_at(len(self) - 1)*/
	@Override
	public X delete_last() {return this.delete_at(this.len() - 1);}

/*	def _copy_forward(self, i, n, A, j): # O(n)
		for k in range(n):
			A[j + k] = self.A[i + k]
*/
	void _copy_forward(int i, int n, X[]  A, int j) {
		for (int k=0;k<n;k++)
			A[j+k]=this.A[i+k];
	}
/*def _copy_backward(self, i, n, A, j): # O(n)
		for k in range(n - 1, -1, -1):
		A[j + k] = self.A[i + k]
 */
	void _copy_backward(int i, int n, X[]  A, int j) {
		for (int k=n-1;k>-1;k--)
			A[j+k]=this.A[i+k];
	}

	public static void main(String[] args) {
		// At this point we need to create an Iterable with 
		// some data in order to build the Array_Seq
		List<Integer> data = new ArrayList<>();
		data.add(0);data.add(1);data.add(2);
		data.add(3);data.add(4);data.add(5);
		data.add(6);data.add(7);data.add(8);
		data.add(9);
		Array_Seq<List<Integer>, Integer> as = new Array_Seq<>();
		as.build(data);
		as.insert_at(2, 22);
		as.insert_first(11);
		as.insert_last(99);
		for(Object a: as.iter_seq()) 
			System.out.print(a+",");
		System.out.println();
		System.out.println(as.delete_at(5));
		System.out.println(as.delete_first());
		System.out.println(as.delete_last());
		for(Object a: as.iter_seq()) 
			System.out.print(a+",");		
	}

}