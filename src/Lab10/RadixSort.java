package Lab10;

/*
Αριθμοτακτική Ταξινόμηση:
============================
 
Βρόγχος 1: Χαρακτήρες από Δεξιά προς τα Αριστερά
Βρόγχος 2: Μετρά πόσες φορές εμφανίζεται ο κάθε χαρακτήρας για τη
συγκεκριμένη θέση και αυξάνει τον μετρητή στον πίνακα tempArray[1-257] 
στη θέση ***ASCII_VALUE+1*** Ο λόγος που τοποθετούμε στο ASCII_VALUE+1 
είναι για να τοποθετηθεί αργότερα η μικρότερη τιμή στη θέση 0 (δες πιο κάτω).
 
Βρόγχος 3: Υπολογίζει τη σειρά που θα τοποθετηθεί η κάθε λέξη βάση του
γράμματος της. Αν ένα γράμμα εμφανιστεί πάνω από μία φορά η τιμή του θα 
αυξηθεί κάθε φορά που χρησιμοποιείται στον βρόχο 4. Το μικρότερο γράμμα 
θα είναι στη θέση 0.

Βρόγχος 4: Αντιγράφει από το in στο out τη λέξη στη σωστή θέση.
Κάθε φορά αυξάνει την τιμή στον πίνακα tempArray ώστε αν υπάρχουν πάνω από μία 
εμφανίσεις του ιδίου γράμματος να το τοποθετήσει στην ακριβώς επόμενη θέση. 
Η πρώτη τιμή θα είναι το 0.
 
*/
public class RadixSort {

	static void printFlightCodes(String[][] flightCode) {
		for (String[] strings : flightCode) {
			System.out.print(strings[0] + ":" + strings[1] + ":" + strings[2] + ", ");
		}
		System.out.println("");
	}

	public void countingRadixSort(String[][] arr, int stringLen, int sortColumn) {
		// Simplify By Using A Fixed size for BUCKETS
		final int BUCKETS = 256;

		int N = arr.length;
		String[][] buffer = new String[N][2];

		String[][] in = arr;
		String[][] out = buffer;
		// Βρόχος 1: Χαρακτήρες Από Δεξιά προς τα Αριστερά
		for (int pos = stringLen - 1; pos >= 0; pos--) {
			int[] tempArray = new int[BUCKETS + 1];
			// Βρόχος 2: Μετρά πόσες φορές εμφανίζεται ο κάθε χαρακτήρας για τη
			// συγκεκριμένη θέση
			// και αυξάνει τον μετρητή στον πίνακα tempArray[1-257] στη θέση
			// ***ASCII_VALUE+1***
			// Ο λόγος τοποθετούμε στο ASCII_VALUE+1 είναι για να τοποθετηθεί η μικρότερη
			// τιμή στη θέση 0 (δες πιο κάτω).
			/*** ADD YOUR CODE HERE ***/
			
			// Βρόχος 3: Υπολογίζει τη σειρά που θα τοποθετηθεί η κάθε λέξη
			// βάση του γράμματος της. Αν ένα γραμμα εμφανιστεί πάνω από μία φορά
			// η τιμή του θα αυξηθεί κάθε φορά που χρησιμοποιείται στον βρόχο 4.
			/*** ADD YOUR CODE HERE ***/
			
			// Βρόχος 4: Αντιγράφει από το in στο out τη λέξη στη σωστή θέση.
			// Κάθε φορά αυξάνει την τιμή ώστε αν υπάρχουν πάνω από μία εμφανίσεις
			// του ιδίου γράμματος να το τοποθετήσει στην ακριβώς επόμενη θέση.
			// Η πρώτη τιμή θα είναι το 0.
			/*** ADD YOUR CODE HERE ***/
			
			// Swap in and out roles
			/*** ADD YOUR CODE HERE ***/
			
		}
		// if odd number of passes, in is buffer, out is arr; so copy back
		/*** ADD YOUR CODE HERE ***/
	}

	public static void main(String[] args) {
		RadixSort radixSort = new RadixSort();
		String[][] flightCode = new String[50][3];
		flightCode[0][0]="SU2072";flightCode[0][1]="1315";flightCode[0][2]="Moscow";
		flightCode[1][0]="SU2172";flightCode[1][1]="1315";flightCode[1][2]="Moscow";
		flightCode[2][0]="OS0835";flightCode[2][1]="0240";flightCode[2][2]="Vienna";
		flightCode[3][0]="OS0831";flightCode[3][1]="1705";flightCode[3][2]="Vienna";
		flightCode[4][0]="0B0137";flightCode[4][1]="0925";flightCode[4][2]="Buchar";
		flightCode[5][0]="BA0660";flightCode[5][1]="2310";flightCode[5][2]="London";
		flightCode[6][0]="BA0664";flightCode[6][1]="1405";flightCode[6][2]="London";
		flightCode[7][0]="BA0662";flightCode[7][1]="1825";flightCode[7][2]="London";
		flightCode[8][0]="BA0660";flightCode[8][1]="2140";flightCode[8][2]="London";
		flightCode[9][0]="BA0664";flightCode[9][1]="1405";flightCode[9][2]="London";
		flightCode[10][0]="BA0662";flightCode[10][1]="1825";flightCode[10][2]="London";
		flightCode[11][0]="CY0461";flightCode[11][1]="1250";flightCode[11][2]="Herakl";
		flightCode[12][0]="U22219";flightCode[12][1]="1840";flightCode[12][2]="London";
		flightCode[13][0]="U28969";flightCode[13][1]="1935";flightCode[13][2]="London";
		flightCode[14][0]="EC5727";flightCode[14][1]="1735";flightCode[14][2]="Berlin";
		flightCode[15][0]="WK0370";flightCode[15][1]="1215";flightCode[15][2]="Zurich";
		flightCode[16][0]="EK0109";flightCode[16][1]="1020";flightCode[16][2]="Dubai ";
		flightCode[17][0]="EK0110";flightCode[17][1]="1815";flightCode[17][2]="Malta ";
		flightCode[18][0]="EW9902";flightCode[18][1]="1225";flightCode[18][2]="Dussel";
		flightCode[19][0]="LS1269";flightCode[19][1]="1545";flightCode[19][2]="Birmin";
		flightCode[20][0]="LS0141";flightCode[20][1]="1640";flightCode[20][2]="Glasgo";
		flightCode[21][0]="LH1768";flightCode[21][1]="1615";flightCode[21][2]="Munich";
		flightCode[22][0]="LH1768";flightCode[22][1]="1615";flightCode[22][2]="Munich";
		flightCode[23][0]="ME0261";flightCode[23][1]="0930";flightCode[23][2]="Beirut";
		flightCode[24][0]="ME0261";flightCode[24][1]="1540";flightCode[24][2]="Beirut";
		flightCode[25][0]="D84401";flightCode[25][1]="1930";flightCode[25][2]="Stockh";
		flightCode[26][0]="OA0910";flightCode[26][1]="0055";flightCode[26][2]="Athens";
		flightCode[27][0]="OA0902";flightCode[27][1]="0940";flightCode[27][2]="Athens";
		flightCode[28][0]="OA0546";flightCode[28][1]="1320";flightCode[28][2]="Thessa";
		flightCode[29][0]="OA0904";flightCode[29][1]="1445";flightCode[29][2]="Athens";
		flightCode[30][0]="OA0914";flightCode[30][1]="1745";flightCode[30][2]="Athens";
		flightCode[31][0]="OA0906";flightCode[31][1]="1950";flightCode[31][2]="Athens";
		flightCode[32][0]="OA0910";flightCode[32][1]="2140";flightCode[32][2]="Athens";
		flightCode[33][0]="OA0902";flightCode[33][1]="0940";flightCode[33][2]="Athens";
		flightCode[34][0]="OA0546";flightCode[34][1]="1320";flightCode[34][2]="Thessa";
		flightCode[35][0]="OA0904";flightCode[35][1]="1445";flightCode[35][2]="Athens";
		flightCode[36][0]="OA0914";flightCode[36][1]="1745";flightCode[36][2]="Athens";
		flightCode[37][0]="OA0906";flightCode[37][1]="1950";flightCode[37][2]="Athens";
		flightCode[38][0]="QR0265";flightCode[38][1]="1100";flightCode[38][2]="Doha  ";
		flightCode[39][0]="GQ0600";flightCode[39][1]="1050";flightCode[39][2]="Athens";
		flightCode[40][0]="GQ0602";flightCode[40][1]="1535";flightCode[40][2]="Athens";
		flightCode[41][0]="GQ0550";flightCode[41][1]="2055";flightCode[41][2]="Thessa";
		flightCode[42][0]="GQ0550";flightCode[42][1]="2055";flightCode[42][2]="Thessa";
		flightCode[43][0]="GQ0604";flightCode[43][1]="2210";flightCode[43][2]="Athens";
		flightCode[44][0]="GQ0600";flightCode[44][1]="1050";flightCode[44][2]="Athens";
		flightCode[45][0]="GQ0602";flightCode[45][1]="1535";flightCode[45][2]="Athens";
		flightCode[46][0]="GQ0604";flightCode[46][1]="2125";flightCode[46][2]="Athens";
		flightCode[47][0]="HV5313";flightCode[47][1]="1410";flightCode[47][2]="Amster";
		flightCode[48][0]="U80107";flightCode[48][1]="1025";flightCode[48][2]="TelAvi";
		flightCode[49][0]="U67119";flightCode[49][1]="1525";flightCode[49][2]="Moscow";
		printFlightCodes(flightCode);
		int sortColumn = 2;
		radixSort.countingRadixSort(flightCode, flightCode[0][sortColumn].length(), sortColumn);
		printFlightCodes(flightCode);
	}

}