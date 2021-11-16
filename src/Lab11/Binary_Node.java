package Lab11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Binary_Node <E extends Iterable<X>, X extends Item<K,?>, K extends Comparable<? super K>>{

	X item;
	Binary_Node<E,X,K> left;
	Binary_Node<E,X,K> right;
	Binary_Node<E,X,K> parent;
//	def __init__(A, x): # O(1)
//		A.item = x
//		A.left = None
//		A.right = None
//		A.parent = None
//		# A.subtree_update() # wait for R07!
//*/
	public Binary_Node(){
		this(null);
	}
	
	public Binary_Node(X x){
		item = x;
		this.left = null;
		this.right = null;
	}
/*
 * Exercise: Given an array of items A = (a0;a1,a2...an-1), describe a O(n)-time algorithm to construct
	a binary tree T containing the items in A such that 
		(1) the item stored in the ith node of T’s traversal order is item ai, and 
		(2) T has height O(log n).
	Solution: Build T by storing the middle item in a root node, 
	and then recursively building the
	remaining left and right halves in left and right subtrees. 
	This algorithm satisfies property 
	(1) by definition of traversal order, and property 
	(2) because the height roughly follows the recurrence
	H(n) = 1 + H(n=2). The algorithm runs in O(n) time because every node is 
	recursed on once doing constant work.
*/
/*def build(X)::
 	A = [x for x in X]
	def build_subtree(A, i, j)
	c = (i + j) // 2
	root = self.Node_Type(A[c])
		if i < c: # needs to store more items in left subtree
			root.left = build_subtree(A, i, c - 1)
			root.left.parent = root
		if c < j: # needs to store more items in right subtree
			root.right = build_subtree(A, c + 1, j)
			root.right.parent = root
		return root
	self.root = build_subtree(A, 0, len(A)-1)
*/
	Binary_Node<E,X,K> build(Sequence<E,X,K> A) {
		return build_subtree(A, 0, A.len()-1);
	}
	Binary_Node<E,X,K> build_subtree(Sequence<E,X,K> A, int i, int j){
		int c = (i + j) / 2;
		Binary_Node<E,X,K> root = new Binary_Node<>(A.get_at(c));
		if (i < c) { //needs to store more items in left subtree
			root.left = this.build_subtree(A, i, c - 1);
			root.left.parent = root;
		}
		if (c < j) { //needs to store more items in right subtree
			root.right = this.build_subtree(A, c + 1, j);
			root.right.parent = root;
		}
		return root;
	}
	
/*	def subtree_iter(A): # O(n)
		if A.left: yield from A.left.subtree_iter()
		yield A
		if A.right: yield from A.right.subtree_iter()	
*/
	public E iter_seq() {
		List<X> data = new ArrayList<>();
		if (this.left != null) data.addAll((Collection<X>)this.left.iter_seq());
		data.add(this.item);
		if (this.right != null) data.addAll((Collection<X>)this.right.iter_seq());
		return (E) data;
	}
/*** Tree Navigation ***/
/*	def subtree_first(A): 					# O(h)
		if A.left: return A.left.subtree_first()
		else: return A
*/	
	Binary_Node<E,X,K> subtree_first(){
		Binary_Node<E,X,K> A = this;
		if (A.left != null) return A.left.subtree_first();
		else return A;
	}
/*	def subtree_last(A): 					# O(h)
		if A.right: return A.right.subtree_last()
		else: return A
*/
	Binary_Node<E,X,K> subtree_last(){
		Binary_Node<E,X,K> A = this;
		if (A.right != null) return A.right.subtree_last();
		else return A;
	}
/*	def successor(A): 						# O(h)
		if A.right: return A.right.subtree_first()
		while A.parent and (A is A.parent.right):
			A = A.parent
		return A.parent
*/
	Binary_Node<E,X,K> successor(){
		Binary_Node<E,X,K> A = this;
		if (A.right != null) return A.right.subtree_first();
		while(A.parent != null && A == A.parent.left)
			A = A.parent;
		return A.parent;
	}
/*	def predecessor(A): 					# O(h)
		if A.left: return A.left.subtree_last()
		while A.parent and (A is A.parent.left):
			A = A.parent
		return A.parent
	*/
	Binary_Node<E,X,K> predecessor(){
		Binary_Node<E,X,K> A = this;
		if (A.left != null) return A.left.subtree_last();
		while(A.parent != null && A == A.parent.left)
			A = A.parent;
		return A.parent;
	}
	
/*** Dynamic Operations ***/
/*	def subtree_insert_before(A, B): # O(h)
		if A.left:
			A = A.left.subtree_last()
			A.right, B.parent = B, A
		else:
			A.left, B.parent = B, A
		40 # A.maintain() # wait for R07!
*/
	void subtree_insert_before(Binary_Node<E,X,K> B) {
		Binary_Node<E,X,K> A = this;
		if (A.left != null) {
			A = A.left.subtree_last();
			A.right = B; B.parent = A;
		}else {
			A.left = B; B.parent=A;
		}
	}
/*	def subtree_insert_after(A, B): # O(h)
		if A.right:
			A = A.right.subtree_first()
			A.left, B.parent = B, A
		else:
			A.right, B.parent = B, A
		# A.maintain() # wait for R07!
*/
	void subtree_insert_after(Binary_Node<E,X,K> B) {
		Binary_Node<E,X,K> A = this;
		if (A.right != null) {
			A = A.right.subtree_first();
			A.left = B; B.parent = A;
		}else {
			A.right = B; B.parent=A;
		}
	}
	
/*	def subtree_delete(A): # O(h)
		if A.left or A.right:
			if A.left: B = A.predecessor()
			else: B = A.successor()
			A.item, B.item = B.item, A.item
			return B.subtree_delete()
		if A.parent:
			if A.parent.left is A: A.parent.left = None
			else: A.parent.right = None
		# A.parent.maintain() # wait for R07!
		return A
*/	
	public Binary_Node<E,X,K>  subtree_delete() {
		Binary_Node<E,X,K> A = this;
		if (A.left != null || A.right != null) {
			Binary_Node<E,X,K> B = null;
			if (A.left != null) B = A.predecessor();
			else B = A.successor();
			Item<K,?> temp = A.item;
			A.item = B.item;
			B.item = (X) temp;
			return B.subtree_delete();
		}
		if (A.parent != null) {
			if (A.parent.left == A) A.parent.left = null;
			else A.parent.right = null;
		}
		return A;
	}
	@Override
	public String toString() {
		return (String) this.item.value;
	}
}
