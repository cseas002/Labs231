package Lab9;
/*class Linked_List_Node: */
class Linked_List_Node<X extends Item<K,?>, K extends Comparable<? super K>> {
	X item;
	Linked_List_Node<X,K> next;
/*	def __init__(self, x): # O(1)
		self.item = x
		self.next = None	*/
	public Linked_List_Node(X x) {
		this.item = x;
		this.next = null;
	}
/*	def later_node(self, i): # O(i)
		if i == 0: return self
		assert self.next
		return self.next.later_node(i - 1)*/	
	public Linked_List_Node<X,K> later_node(int i) {
		if (i == 0) return this;
		if (this.next == null) return null;
		return this.next.later_node(i - 1);
	}
}
