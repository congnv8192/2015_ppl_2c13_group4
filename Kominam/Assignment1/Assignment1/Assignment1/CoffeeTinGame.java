package Assignment1;

import java.util.Arrays;
import static Userlib.TextIO.*;
/**
 * @overview: a program that performs the Coffee Tin Game.
 * 
 * @author (Kominam)
 */
public class CoffeeTinGame
{
    // constant value for green bean
    private static final char GREEN = 'G';
    // constant value for blue bean
    private static final char  BLUE = 'B';
    // constant for removed beans 
    private static final char REMOVED = '-';
    
      /**
      * the main procedure
      * @effects 
      *    initialise a coffee tin
      *    {@link @tinGame(char[])}: perform the coffee tin game on tin
      *    if last bean is correct
      *      {@link TextIO#putf(String, Object...)}: print its colour 
      *    else
      *      {@link putf(String)}: print an error message
      */
     public static void main(String [] args){
        // initialise somme beans
        char[] beans = {GREEN, BLUE, BLUE, GREEN, BLUE, GREEN};
        
        // count number of greens
        int greens = 0;
        for (char b : beans) {
            if (b == GREEN) {
                greens++;
            }
        }
        // the expected last bean
        final char last = (greens % 2 == 1) ? GREEN : BLUE;
        // p0 = green parity /\ 
        // (p0=1 -> last=GREEN) /\ (p0=0 -> last=BLUE)
        
        // print the content of tin before the game
        putf("Tin before : %s %n", Arrays.toString(beans));
        
        // perform the game
        char lastBean = tinGame(beans);
        // lastBean = last \/ lastBean != last
        
        // print the content of tin and last bean
        putf("Tin after : %s %n", Arrays.toString(beans));
        
        // check if last bean as expected and print 
        if (lastBean == last) {
            putf("Last bean: %c", lastBean);
        } else {
            putf("Oops, wrong last bean: %c (expected: %c) %n", lastBean, last);
        }
     }
     
     /** 
      * Takes out any two beans randomly
      * @requirement: tin is not null /\ tin.length > 0
      * @modifies tin
      * @effects: repeatedly remove two beans from tin
      *     create an array to store two beans
      *     that are taken out from tin
      *     takes out two beans randomly
      *         {@link #Math.random()}: picks random b0
      *              until tin[b0] is not REMOVED
      *         {@link #Math.random()}: picks random b1 
      *              until tin[b1] is not REMOVED
      *              and b1 is not equal to b0
      */
     private static int[] takeTwo(char[] tin){
         // Array b is declared to store two beans
         // which are taken out
         int[] b = new int[2];
         // takes one bean randomly
         // until this bean is removed
        
             do {
                 b[0] = (int)(Math.random()*tin.length);
             } while (tin[b[0]] == REMOVED);
            // takes the next bean randomly
            // until this bean is removed
            // and this bean is equal to the first bean
             do {
                 b[1] = (int)(Math.random()*tin.length);
             } while (tin[b[1]] == REMOVED || b[0] == b[1]); 
             
             // print out the position of taken beans
             putln("Take: (" + b[0] + "," + tin[b[0]] + "),(" + b[1] + "," + tin[b[1]] + ")");
         
         return b;
     }
     
     /**
      * determine the color of the last bean
      * @requirement: tin is not null /\ tin.length > 0
      * @effects: 
      *     {@link #takeTwo()}: after taking out two beans
      *     if they are the same color 
      *         throw them both away
      *         put a Blue Mountain bean back in
      *     else 
      *         throw away the blue one
      *         put the green one back
      *     until the bean in the tin = 1
      */
     private static char[] updateTin(char[] tin){
         int b1, b2;
         // count is assigned to the length of tin
         int count = tin.length;
         /**
          * check condition: if two beans are the same color
          *     throw both away
          *     put Blue bean back 
          *  otherwise 
          *     put Green bean back
          */
         while (count >= 2){
             int[] a = takeTwo(tin);
             // remove beans in tin
             b1 = tin[a[0]];
             tin[a[0]] = REMOVED;
             b2 = tin[a[1]];
             tin[a[1]] = REMOVED;
             if (b1 == BLUE && b2 == BLUE || b1 == GREEN && b2 == GREEN){
                 // put blue in tin
                 tin[a[0]] = BLUE;
             } 
             else {
                 // put green in tin
                 tin[a[0]] = GREEN;
             }
             // print out the current tin after putting back
             putln("Put back: " + tin[a[0]]);
             putf("Tin current : %s %n", Arrays.toString(tin));
                 
             // reduce the lengrh of tin
             count = count-1;
        }
         // return the bean in the tin
         return tin;
     }
     
     /**
      * perform the coffee tin game
      * @requirement: tin is not null /\ tin.length > 0
      * @effects:
      *     {@link #updateTin()}: invoke update tin 
      *     0 < i < tin.length
      *         if a[i] is not remove 
      *             a[i] == lastBean
      *     return color of the lastBean
      */
     private static char tinGame(char[] tin) {
         // invoke updateTin()
         char[] a = updateTin(tin);
         // initialise the last bean is removed
         char lastBean = REMOVED;
         int l = tin.length;
         
         for (int i = 0; i < l; i++){
             if (a[i] != REMOVED){
                 // a[i] is not remove
                 // lastBean is a[i]
                 lastBean = a[i];
                 break;
             }
         }
         // return color of the lastBean
         return lastBean;
     }
}
