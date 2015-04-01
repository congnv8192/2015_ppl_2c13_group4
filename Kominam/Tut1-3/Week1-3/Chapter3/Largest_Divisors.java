package Chapter3;

import static userlib.TextIO.*;
/**
 * Show which number has largest divisor and 
 * what is it ?
 * @author (Kominam)
 */
public class Largest_Divisors
{
   public static void main(String[] args) 
        {
            int N, largest;
            int testDivisor;
            int maxDivisor;
            int divisorCount = 0;
            
                maxDivisor = 1;
                largest = 1;
                // count number divisor does it have 
                for (N = 2; N <= 10000; N++) {
                    for (testDivisor = 1; testDivisor < N; testDivisor++) {
                        if (N % testDivisor == 0){
                             divisorCount++;                            
                        }
                    }
                    /* if divisorCount > maxDivisor
                     * maxDivisor is divisor 
                     * and N is the number has largest divisor
                    */ 
                    if ( divisorCount > maxDivisor ){
                        maxDivisor = divisorCount;
                        largest = N;
                    }
                }
                
                putln("The number has largest divisor is " +largest +" with " +maxDivisor);
        }
}
