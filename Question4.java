import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    
    int num = in.nextInt();
    
    int count = num;

    for (int a = 0; a < num ; a++ ) {
	    

        for (int it = 0; it < count ; it++ ) {
	    
        System.out.print("*");

        }

        count--;
        System.out.println();
    } 
  }

}
