package Lab11;

import java.util.List;

//class Set_Binary_Tree(Binary_Tree): # Binary Search Tree
public class Set_Binary_Tree<E extends Iterable<X>, X extends Item<K, ?>, K extends Comparable<? super K>>
		extends Binary_Tree<E, X, K> implements Set<E, X, K> {
	BST_Node<E, X, K> root;

// super().__init__(BST_Node)
	public Set_Binary_Tree() {
	}

	@Override
	public void build(E e) {	
		for(X a: e)
			this.insert(a);
	}

	@Override
	public int len() {
		return this.size;
	}

//	def find(self, k):
//	if self.root:
//		node = self.root.subtree_find(k)
//		if node: return node.item
	@Override
	public X find(K key) {
		if (root != null) {
			BST_Node<E, X, K> node = this.root.subtree_find(key);
			if (node != null)
				return node.item;
		}
		return null;
	}

//	def insert(self, x):
//		new_node = self.Node_Type(x)
//		if self.root:
//			self.root.subtree_insert(new_node)
//			if new_node.parent is None: return False
//		else:
//			self.root = new_node
//		self.size += 1
//		return True
	@Override
	public void insert(X x) {
		BST_Node<E, X, K> new_node = new BST_Node<>(x);
		if (this.root != null) {
			this.root.subtree_insert(new_node);
			// if (new_node.parent == null) return false;
		} else {
			this.root = new_node;
		}
		this.size++;
		// return true;
	}

//	def delete(self, k):
//		assert self.root
//		node = self.root.subtree_find(k)
//		assert node
//		ext = node.subtree_delete()
//		if ext.parent is None: self.root = None
//		self.size -= 1
//		return ext.item
	@Override
	public X delete(K key) {
		if (this.root == null)
			return null;
		BST_Node<E, X, K> node = this.root.subtree_find(key);
		if (node == null)
			return null;
		BST_Node<E, X, K> ext = (BST_Node<E, X, K>)node.subtree_delete();
		if (ext.parent == null)
			this.root = null;
		this.size--;
		return ext.item;
	}

	@Override
	public E iter_ord() {
		return this.root.iter_seq();
	}

//	def find_min(self):
//		if self.root: return self.root.subtree_first().item
	@Override
	public X find_min() {
		if (root != null)
			return this.root.subtree_first().item;
		return null;
	}

//	def find_max(self):
//		if self.root: return self.root.subtree_last().item
	@Override
	public X find_max() {
		if (root != null)
			return this.root.subtree_last().item;
		return null;
	}

//	def find_next(self, k):
//		if self.root:
//			node = self.root.subtree_find_next(k)
//			if node: return node.item
	@Override
	public X find_next(K key) {
		if (root != null) {
			BST_Node<E, X, K> node = this.root.subtree_find_next(key);
			if (node != null)
				return node.item;
		}
		return null;
	}
//	def find_prev(self, k):
//		if self.root:
//			node = self.root.subtree_find_prev(k)
//			if node: return node.item

	@Override
	public X find_prev(K key) {
		if (root != null) {
			BST_Node<E, X, K> node = this.root.subtree_find_prev(key);
			if (node != null)
				return node.item;
		}
		return null;
	}

	public static void main(String[] args) {
		Set<List<Item<Integer,Integer>>, Item<Integer,Integer>, Integer> sbt = new Set_Binary_Tree<>();
		
		sbt.insert(new Item<Integer,Integer>(44,44));
		sbt.insert(new Item<Integer,Integer>(22,22));
		sbt.insert(new Item<Integer,Integer>(33,33));
		sbt.insert(new Item<Integer,Integer>(11,11));
		sbt.insert(new Item<Integer,Integer>(00,00));
		
		sbt.insert(new Item<Integer,Integer>(77,77));
		sbt.insert(new Item<Integer,Integer>(55,55));
		sbt.insert(new Item<Integer,Integer>(66,66));
		sbt.insert(new Item<Integer,Integer>(88,88));
		sbt.insert(new Item<Integer,Integer>(99,99));
		
		System.out.println();
		System.out.println(sbt.find(11));
		System.out.println(sbt);
		System.out.println(sbt.find(99));
		System.out.println(sbt.find(999));
		for(Object a: sbt.iter_ord()) 
			System.out.print(a+",");
		System.out.println("");
		System.out.println(sbt.find_max());
		System.out.println(sbt.find_min());
		System.out.println(sbt.find_prev(55));
		System.out.println(sbt.find_next(55));
		System.out.println(sbt.delete(55));
		sbt.insert(new Item<Integer,Integer>(45,45));
		for(Object a: sbt.iter_ord()) 
			System.out.print(a+",");
	}

}
