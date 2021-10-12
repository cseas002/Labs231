package Lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Link_List_Seq<E extends Iterable<?>, X extends Number> implements Sequence<E, X> {
    int size;
    Linked_List_Node<X> head;

    /*
     * def __init__(self): # O(1)
     * 		self.head = None self.size = 0
     */
    public Link_List_Seq() {
        this.head = null;
        this.size = 0;
    }

    /* def __len__(self): return self.size # O(1) */
    @Override
    public int len() {
        return this.size;
    }

    /*
     * def build(self, X): # O(n)
     * 		for a in reversed(X):
     * 			self.insert_first(a)
     */
    @Override
    public void build(E e) {
        Collections.reverse((List<X>) e);
        for (X a : (List<X>) e)
            this.insert_first(a);
    }

    @Override
    public E iter_seq() {
        List<X> data = new ArrayList<X>();
        Linked_List_Node<X> next = this.head;
        while (next != null) {
            data.add(next.item);
            next = next.next;
        }
        return (E) data;
    }

    /* def get_at(self, i): # O(i)
     * 		node = self.head.later_node(i)
     * 		return node.item
     */
    @Override
    public X get_at(int i) {
        Linked_List_Node<X> node = this.head.later_node(i);
        return node.item;
    }

    /*
     * def set_at(self, i, x): # O(i)
     * 		node = self.head.later_node(i)
     * 		node.item = x
     */
    @Override
    public void set_at(int i, X x) {
        Linked_List_Node<X> node = this.head.later_node(i);
        node.item = x;
    }

    /*
     * def insert_at(self, i, x): # O(i)
     * 		if i == 0:
     * 			self.insert_first(x)
     * 			return
     * 		new_node = Linked_List_Node(x)
     * 		node = self.head.later_node(i - 1)
     * 		new_node.next = node.next
     * 		node.next = new_node self.size += 1
     */
    @Override
    public void insert_at(int i, X x) {
        if (i == 0) {
            this.insert_first(x);
            return;
        }
        Linked_List_Node<X> new_node = new Linked_List_Node<>(x);
        Linked_List_Node<X> node = this.head.later_node(i - 1);
        new_node.next = node.next;
        node.next = new_node;
        this.size++;
    }

    /*
     * def delete_at(self, i): # O(i)
     * 		if i == 0:
     * 			return delete_first()
     * 		node = self.head.later_node(i - 1)
     * 		x = node.next.item
     * 		node.next = node.next.next
     * 		self.size -= 1
     * 		return x
     */
    @Override
    public X delete_at(int i) {
        if (i == 0)
            return delete_first();
        Linked_List_Node<X> node = this.head.later_node(i - 1);
        X x = node.next.item;
        node.next = node.next.next;
        this.size--;
        return x;
    }

    /*
     * def insert_first(self, x): # O(1)
     * 		new_node = Linked_List_Node(x)
     * 		new_node.next = self.head
     * 		self.head = new_node self.size += 1
     */
    @Override
    public void insert_first(X x) {
        Linked_List_Node<X> new_node = new Linked_List_Node<>(x);
        new_node.next = this.head;
        this.head = new_node;
        this.size++;
    }

    /*
     * def delete_first(self): # O(1)
     * 		x = self.head.item
     * 		self.head = self.head.next
     * 		self.size -= 1
     * 		return x
     */
    @Override
    public X delete_first() {
        X x = this.head.item;
        this.head = this.head.next;
        this.size--;
        return x;
    }

    /* def insert_last(self, x):
     * 		self.insert_at(len(self), x) */
    @Override
    public void insert_last(X x) {
        this.insert_at(this.size, x);
    }

    /* def delete_last(self):
     * 		return self.delete_at(len(self) - 1) */
    @Override
    public X delete_last() {
        return this.delete_at(this.size - 1);
    }

    public static void main(String[] args) {
        // At this point we need to create an Integrable with
        // some data in order to build the Link_List_Seq
        List<Integer> data = new ArrayList<>();
        data.add(0);
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        data.add(6);
        data.add(7);
        data.add(8);
        data.add(9);
        Link_List_Seq<List<Integer>, Integer> lls = new Link_List_Seq<>();
        lls.build(data);
        lls.insert_at(2, 22);
        lls.insert_first(11);
        lls.insert_last(99);
        for (Object a : lls.iter_seq())
            System.out.print(a + ",");
        System.out.println();
        System.out.println(lls.delete_at(5));
        System.out.println(lls.delete_first());
        System.out.println(lls.delete_last());
        for (Object a : lls.iter_seq())
            System.out.print(a + ",");
    }
}
