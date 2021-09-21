package Lab03;

import java.util.ArrayList;
import java.util.List;

public class Array_Seq <X> implements Sequence<X> {
    public static final int MAXSIZE = 10000;
    private X[] A;
    int size;
    public Array_Seq()
    {
        this.A = (X[]) new Object[MAXSIZE];
        this.size = 0;
    }
//    @Override
//    public void build(E e) {
//        for (Object a : e)
//        {
//            this.A[size] = (X) a;
//            this.size++;
//        }
//    }

    public void add(X x)
    {
        this.A[size] = x;
        size++;
    }

    @Override
    public int len() {
        return this.size;
    }

//    @Override
//    public E iterSeq() {
//        List<X> data = new ArrayList<>();
//        for (int i = 0; i < this.len(); i++)
//            data.add(this.A[i]);
//        return (E) data;
//    }

    @Override
    public X getAt(int i) {
        return this.A[i];
    }

    @Override
    public void setAt(int i, X x) {
        this.A[i] = x;
    }
}
