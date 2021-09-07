package Lab01;

public class IntegerSet {
    private final int SETSIZE = 101;
    private boolean[] set_elements; // holds a set of numbers from 0 - 100
    
  public IntegerSet () {
  }

  // A constructor that copies from an existing set.
  public IntegerSet (IntegerSet existingSet) {
	  
	  /*** ??? ***/
	  
  }

  public void deleteElement(int i) {
	  
	  /*** ??? ***/
	  
  }

  public void insertElement(int i) {
	  
	  /*** ??? ***/
	  
  }

    // Print a set to System.out
    public void toSetString() {
  	  
  	  /*** ??? ***/
  	  
    }
    
    // return true if two sets are equal
    public boolean isEqualTo(IntegerSet is2) {
  	  
  	  /*** ??? ***/
  	  
    	return false;
    }
    
  
  // The union of this set and another set
  public IntegerSet union(IntegerSet is2) {
	  
	  /*** ??? ***/
	  
  	return null;
  }

  // The intersection of this set and another set
  public IntegerSet intersection(IntegerSet is2) {
	  
	  /*** ??? ***/
	  
	  	return null;
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
  public static void main (String [] args) {
	  
	  IntegerSet set1 = new IntegerSet();
	    IntegerSet set2 = new IntegerSet();
	      java.util.Random r = new java.util.Random();
	      
	      for (int i=0; i<10; i++) {
	          set1.insertElement(r.nextInt(100));
	      }
	      for (int i=0; i<15; i++) {
	          set2.insertElement(r.nextInt(100));
	      }
	      
	      System.out.print("Set 1 :");
	      set1.set_elements[1]=true;

	      System.out.print("\nSet 2 :");
	      set2.toSetString();

	      IntegerSet union = set1.union(set2);
	      System.out.print("\nUnion: ");
	      union.toSetString();

	      IntegerSet intersection = set2.intersection(set1);
	      System.out.print("\nIntersection: ");
	      intersection.toSetString();
	      System.out.println("\n");	
	  
  }


}

