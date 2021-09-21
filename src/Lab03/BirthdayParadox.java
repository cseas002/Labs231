package Lab03;

public class BirthdayParadox {
    private static int count = 0;
    private static boolean addAndCheck(Array_Seq<Integer> array_seq, Integer newInteger)
    {
        array_seq.add(newInteger);
        for (int i = 0; i < array_seq.len() - 1; i++)
            if (array_seq.getAt(i).equals(newInteger))
                {
                    //System.out.println("Found same birthday at attempt " + count);
                    return true;
                }
        return false;
    }

    public static void main(String[] args) {
        int[] occurrences = new int[300];
        int[] occurrencesUntil = new int[300];
        for (int i = 0; i < 100000; i++) {
            Array_Seq<Integer> birthdays = new Array_Seq<>();
            count = 0;
            while (!addAndCheck(birthdays, (int) (Math.random() * 365 + 1)))
                count++;
            if (count < occurrences.length) {
                occurrences[count]++;

                for (int j = count; j < occurrencesUntil.length; j++)
                    occurrencesUntil[j] ++;
            }
        }

        for (int i = 0; i < occurrences.length; i++)
            //System.out.println("Same birthdays with " + i + " people : " + occurrences[i]);
            System.out.println(i + " " + occurrencesUntil[i]);
    }
}