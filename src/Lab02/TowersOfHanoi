// JAVA recursive function to solve tower of hanoi puzzle
import java.util.*;
import java.io.*;
import java.math.*;
public class TowersOfHanoi
{
final static int N = 5; // Number of disks
static Stack<Integer> rodA = new Stack<>();
static Stack<Integer> rodB = new Stack<>();
static Stack<Integer> rodC = new Stack<>();
static char[] rods = new char[3];
static int count = 0; // count should be equal to 2^N - 1

static void initializeRods()
{
    for (int i = N; i > 0; i--)
        rodA.push(i);
}

static String printSpaces(int spaces)
{
    String str = "";
    for (int i = 0; i < spaces; i++)
        str += ' ';
        
    return str;
}

static String underScoresCount()
{
    String str = "";
    for (int i = 0; i < 6 * N - 3 + 4 * 5; i++) // 6 * N  - 3is because each tower has 6 * N - 1 spaces and dots
        str += '_';                             // 4 * 5 is because there are 4 5 tabs (each tab is 4 spaces)
        
    return str;
}

static String printDots(int howMany)
{
	String dots = "";
	int spaces = N - howMany;
	// Spaces
	for (int i = 0; i < spaces; i++)
		dots += ' ';
 	// Dots
	for (int i = 0; i < howMany * 2 - 1; i++)
		dots += '.';

	// Spaces again 
	for (int i = 0; i < spaces; i++)
		dots += ' ';

	return dots;
}

static void changeAndPrint(int from, int to)
{
	int movingRod = 0;
	switch (from)
		{
			case 'A':
			movingRod = rodA.pop();
			break;

			case 'B':
			movingRod = rodB.pop();
			break;

			case 'C':
			movingRod = rodC.pop();
			break;
		}

	switch (to)
		{
			case 'A':
			rodA.push(movingRod);
			break;

			case 'B':
			rodB.push(movingRod);
			break;

			case 'C':
			rodC.push(movingRod);
			break;
		}

	// Cloning rods
	Stack<Integer> rodATemp = (Stack<Integer>)rodA.clone();
	Stack<Integer> rodBTemp = (Stack<Integer>)rodB.clone();
	Stack<Integer> rodCTemp = (Stack<Integer>)rodC.clone();

	// Printing towers
	for (int i = N; i > 0; i--)
		{
			String row = "\t";
			if (rodATemp.size() == i)
				row += printDots(rodATemp.pop());
			else
			    row += printSpaces(N * 2 - 1);
			row += "\t\t";
			if (rodBTemp.size() == i)
				row += printDots(rodBTemp.pop());
			else
			    row += printSpaces(N * 2 - 1);
			row += "\t\t";
			if (rodCTemp.size() == i)
				row += printDots(rodCTemp.pop());
			else
			    row += printSpaces(N * 2 - 1);
			
			System.out.println(row);
		}
	System.out.println(underScoresCount());
}

static void towerOfHanoi(int n, char from_rod,
                    char to_rod, char aux_rod)
{
    if (n == 1)
    {
        System.out.println("Move disk 1 from rod "+
                           from_rod+" to rod "+to_rod);
        count ++;
	    changeAndPrint(from_rod, to_rod);
        return;
    }
    towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
    System.out.println("Move disk "+ n + " from rod " +
                       from_rod +" to rod " + to_rod );
    count ++;
    changeAndPrint(from_rod, to_rod);
    towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
}
 
// Driver code
public static void  main(String args[])
{
    initializeRods();
    changeAndPrint('A', 'A');
    towerOfHanoi(N, 'A', 'C', 'B'); // A, B and C are names of rods
    System.out.println("\n\n" + count + " steps");
}
}
 
// This code is contributed by jyoti369
