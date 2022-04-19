import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    
    int arrlength = in.nextInt();

    int newarray[] = new int[arrlength];

    for (int i = 0 ; i < arrlength ; i++) {

        int input = in.nextInt();

        newarray[i] = input;
    }

    Arrays.sort(newarray);

    int freq = 1;
    int mode = newarray[0];
    int max = 0;
    for (int i = 1; i < arrlength; i++ ) {
        if (newarray[i] == newarray[i - 1]){
            freq++;
        }
        else{
            if (freq > max){
                mode = newarray[i - 1];
                max = freq;
                
            }
            freq = 1;
        }
    }
    if (freq > max){
        max = freq;
        mode = newarray[arrlength - 1];
    }

    System.out.println(mode);
  }
}
