package Lab9;

class Item<K extends Comparable<? super K>,X> {
	public K key;
	public X value;
	public Item(K k, X x) {	
		this.key = k;
		this.value = x;
	}
	@Override
	public String toString() {
		//return "Item [key=" + key + ", value=" + value + "]";
		return key + ":" + ((value==null)?"-":value) ;
	}

}
