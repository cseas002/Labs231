package Lab11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BST_Node<E extends Iterable<X>, X extends Item<K, ?>, K extends Comparable<? super K>> 
extends Binary_Node<E,X,K>{

//	X item;
//	BST_Node<E, X, K> left;
//	BST_Node<E, X, K> right;
//	BST_Node<E, X, K> parent;
	
	public BST_Node(){
		this(null);	
	}
	public BST_Node(X x){
		item = x;
		this.left = null;
		this.right = null;
	}
	
	public E iter_seq() {
		List<X> data = new ArrayList<>();
		if (this.left != null) data.addAll((Collection<X>)this.left.iter_seq());
		data.add(this.item);
		if (this.right != null) data.addAll((Collection<X>)this.right.iter_seq());
		return (E) data;
	}
	
//def subtree_find(A, k): # O(h)
//	if k < A.item.key:
//		if A.left: return A.left.subtree_find(k)
//	elif k > A.item.key:
//		if A.right: return A.right.subtree_find(k)
//	else: return A
//	return None	
	public BST_Node<E, X, K> subtree_find(K k) {
		/** ADD YOUR CODE HERE **/
		return null;
	}

//	def subtree_find_next(A, k): 					# O(h)
//		if A.item.key <= k:
//			if A.right: return A.right.subtree_find_next(k)
//			else: return None
//		elif A.left:
//			B = A.left.subtree_find_next(k)
//			if B: return B
//		return A
	public BST_Node<E, X, K> subtree_find_next(K k) {
		/** ADD YOUR CODE HERE **/
		return null;
	}

//	def subtree_find_prev(A, k): 					# O(h)
//		if A.item.key >= k:
//			if A.left: return A.left.subtree_find_prev(k)
//			else: return None
//		elif A.right:
//			B = A.right.subtree_find_prev(k)
//			if B:return B
//		return A
	public BST_Node<E, X, K> subtree_find_prev(K k) {
		/** ADD YOUR CODE HERE **/
		return null;
	}

//	def subtree_insert(A, B): 				# O(h)
//		if B.item.key < A.item.key:
//			if A.left: A.left.subtree_insert(B)
//			else: A.subtree_insert_before(B)
//	elif B.item.key > A.item.key:
//			if A.right: A.right.subtree_insert(B)
//			else: A.subtree_insert_after(B)
//	else: A.item = B.item
//
	public void subtree_insert(BST_Node<E, X, K> B) {
		/** ADD YOUR CODE HERE **/
	}
	public Binary_Node<E, X, K> subtree_find_min(){
		/** ADD YOUR CODE HERE **/	
		return null;
	}
	public Binary_Node<E, X, K> subtree_find_max(){
		/** ADD YOUR CODE HERE **/	
		return null;
	}
}
