package Lab03;

interface Sequence <X> {
   // void build(E e);        // given an iterable X, build sequence from items in X
    int len();              // return the number of stored items
   // E iterSeq();            // return the stored items one-by-one in sequence order
    X getAt(int i);         // return the ith item
    void setAt(int i, X x); // replace the ith item with x
}
