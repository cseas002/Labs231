package Lab10;

//Ταξινόμηση με Απαρίθμηση:
//Ο αλγόριθμος εφαρμόζεται εκεί όπου τα προς ταξινόμηση κλειδιά είναι (σχετικά) μικροί, μη
//αρνητικοί ακέραιοι Με άλλα λόγια, το μέγεθος του συνόλου από το οποίο προέρχονται τα κλειδιά πρέπει
//να είναι καθορισμένο εκ των προτέρων, ώστε να είναι τότε δυνατό να αναπαραστήσουμε ένα σύνολο
//από κλειδιά σαν ένα δυαδικό διάνυσμα. Υποθέτουμε, λοιπόν, ότι τα κλειδιά προέρχονται από το
//σύνολο U = {0, 1, . . . , k}. Θα δούμε ότι για k = O(n), ο αλγόριθμος ΤαξινόμησηΜεΑπαρίθμηση
//εκτελείται σε χρόνο Θ(n).

public class CountingSort {
	static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("");
	}

	public int[] counting_sort(int[] A) {
		int maxValue = getMaxVal(A);
		int n = A.length;
		int[] B = new int[n];
		int[] F = new int[maxValue + 1]; // Βρόχος 1
// Βρόχος 2
		/*** ADD YOUR CODE HERE ***/
// Βρόχος 3
		/*** ADD YOUR CODE HERE ***/
// Βρόχος 4
		/*** ADD YOUR CODE HERE ***/
		return B;
	}

	private int getMaxVal(int[] arrayToSort) {
		int maxVal = Integer.MIN_VALUE;
		for (int i : arrayToSort) {
			if (i > maxVal) {
				maxVal = i;
			}
		}
		return maxVal;
	}

	public static void main(String[] args) {
		CountingSort countingSort = new CountingSort();
		int[] arrayToSort = new int[] { 3, 5, 20, 7, 3, 3, 5, 20, 8, 9 };
		printArray(arrayToSort);
		int[] sortedArray = countingSort.counting_sort(arrayToSort);
		printArray(sortedArray);
	}
}
