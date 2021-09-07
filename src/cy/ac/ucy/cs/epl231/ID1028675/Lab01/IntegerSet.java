package cy.ac.ucy.cs.epl231.ID1028675.Lab01;

import java.util.Comparator;

public class IntegerSet {
    private final int SET_SIZE = 101;
    private final boolean[] set_elements; // holds a set of numbers from 0 to 100

    public IntegerSet() {
        set_elements = new boolean[SET_SIZE]; // everything is false by default
    }

    // A constructor that copies from an existing set
    public IntegerSet(IntegerSet existingSet) {
        set_elements = new boolean[SET_SIZE];
        System.arraycopy(existingSet.set_elements, 0, set_elements, 0, SET_SIZE);
    }

    public void deleteElement(int i) {
        set_elements[i] = false;
    }

    public void insertElement(int i) {
        set_elements[i] = true;
    }

    // Print a set to System.out
    public String toString() {
        String str = "{";
        for (int i = 0; i < SET_SIZE; i++)
            if (set_elements[i])
                str += i + ", ";

        String str2 = "";

        if (str.equals("{"))
            str2 = "{}";

        else
        {
            for (int i = 0; i < str.length() - 1; i++)
                str2 += str.charAt(i);

            str2 += '}';
        }

        return str2;
    }

    // return true if two sets are equal
    public boolean equals(IntegerSet is2) {
        for (int i = 0; i < SET_SIZE; i++)
            if (is2.set_elements[i] != set_elements[i])
                return false;
        return true;
    }


    // The union of this set and another set
    public IntegerSet union(IntegerSet is2) {
        IntegerSet newSet = new IntegerSet(this);
        for (int i = 0; i < SET_SIZE; i++)
            if (is2.set_elements[i])
                newSet.set_elements[i] = true;
        return newSet;
    }

    // The intersection of this set and another set
    public IntegerSet intersection(IntegerSet is2) {
        IntegerSet newSet = new IntegerSet();
        for (int i = 0; i < SET_SIZE; i++)
            if (set_elements[i] && is2.set_elements[i])
                newSet.set_elements[i] = true;

        return newSet;
    }


    // return true if the set has no elements
    public boolean isEmpty() {

        /*** ??? ***/

        return false;
    }

    // return the 'length' of a set
    public int cardinality() {

        /*** ??? ***/

        return 0;
    }

    // ------------------------------------------------------------
    // Small test program to verify that IntegerSet works
    public static void main(String[] args) {

        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        java.util.Random r = new java.util.Random();

        for (int i = 0; i < 10; i++) {
            set1.insertElement(r.nextInt(100));
        }
        for (int i = 0; i < 15; i++) {
            set2.insertElement(r.nextInt(100));
        }

        set1.set_elements[1] = true;
        System.out.print("Set 1 : " + set1);


        System.out.print("\nSet 2 :" + set2);

        IntegerSet union = set1.union(set2);
        System.out.print("\nUnion: " + union);

        IntegerSet intersection = set2.intersection(set1);
        System.out.print("\nIntersection: " + intersection);
        System.out.println("\n");

    }


}

