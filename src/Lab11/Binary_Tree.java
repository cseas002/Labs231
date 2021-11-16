package Lab11;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree  <E extends Iterable<X>, X extends Item<K,?>, K extends Comparable<? super K>>{
/*class Binary_Tree:
	def __init__(T, Node_Type = BST_Node):
		T.root = None
		T.size = 0
		T.Node_Type = Node_Type
*/
	BST_Node<E,X,K> root;
	int size;
	public Binary_Tree() {
		this.root = null;
		this.size = 0;
	}

	public static void main(String[] args) {

		Binary_Tree<List<Item<Integer,String>>, Item<Integer,String>, Integer> bt = new Binary_Tree<>();
		bt.root = new BST_Node<>(new Item(100,"BOSS"));
		bt.root.subtree_insert(new BST_Node<>(new Item(80,"WORKERS-EO")));
		bt.root.subtree_insert(new BST_Node<>(new Item(70,"WSUPER-A")));
		bt.root.subtree_insert(new BST_Node<>(new Item(65,"WORKER-A")));
		bt.root.subtree_insert(new BST_Node<>(new Item(78,"WORKER-Β")));
		bt.root.subtree_insert(new BST_Node<>(new Item(90,"WSUPER-Β")));
		bt.root.subtree_insert(new BST_Node<>(new Item(85,"WORKER-C")));
		bt.root.subtree_insert(new BST_Node<>(new Item(95,"WORKER-D")));
		
		bt.root.subtree_insert(new BST_Node<>(new Item(120,"ADMINSUPER-EO")));
		bt.root.subtree_insert(new BST_Node<>(new Item(110,"ASUPER-A")));
		bt.root.subtree_insert(new BST_Node<>(new Item(105,"OFFICER-A")));
		bt.root.subtree_insert(new BST_Node<>(new Item(115,"OFFICER-Β")));
		bt.root.subtree_insert(new BST_Node<>(new Item(130,"ASUPER-Β")));
		bt.root.subtree_insert(new BST_Node<>(new Item(125,"OFFICER-C")));
		bt.root.subtree_insert(new BST_Node<>(new Item(135,"OFFICER-D")));
		for(Object a: bt.root.iter_seq())
			System.out.print(a+",");
		System.out.println("");
		for(Object a: bt.root.left.iter_seq())
			System.out.print(a+",");
		System.out.println("");
		for(Object a: bt.root.right.iter_seq())
			System.out.print(a+",");
		System.out.println("");
		for(Object a: bt.root.subtree_find(120).right.iter_seq())
			System.out.print(a+",");
		System.out.println("");
		System.out.println(bt.root.subtree_find_min().item);
		System.out.println(bt.root.subtree_find_max().item);

	}

}
