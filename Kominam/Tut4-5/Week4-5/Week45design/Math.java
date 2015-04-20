package Week45design;

import static userlib.TextIO.*;
/**
 * @author (Kominam) 
 */
public class Math
{
     /**
     * @overview: the main procedures
     * @effects:
     *   {@link #switch()}: print list problem as follow
     *      switch (option)
     *          case '1': {@link #remainder()}
     *          case '2': {@link #div()}
     *          case '3': {@link #middle()}
     *          case '4': {@link #isPalindrome()}
     *          case '5': {@link #isPrime()}
     *      default()
     *          {@link #putln()}: print error option
     */
    public static void main (String[] args){
    
    }
    
    /**
     * @requirement: array a is not null
     * @effects:
     *  int divisor, dividend
     *  int left
     *  int count = 0
     *      left = divisor - dividend
     *      if (left > dividend)
     *          while (left > dividend)
     *              left -= dividend
     *              count++
     *      return count, left
     */
    public static int remainder(int [] a){
    
    }
    
    /**
     * @requirement:
     * @effects:
     */
    public static int div(){
    
    }
    
    /**
     * @requires s not eq null /\ s.length > 0
     * @effects
     *     if s = s[s.length-1]...s[0], i.e. s is read the same backward and forward
     *         return true
     *     else
     *         return false
     */
    public static void middle(){
    
    }
    
    /** 
     * @requires p >= 1
     * @effects
     *  if p <= 2 
     *    return true
     *    
     *  for each multiple m of a number n (2 <= n < p)
     *    if p = m
     *      return false
     *  return true
     */
    public static boolean isPalindrome(){
    
    }
    
    /**
     * @effects:
     *  for int i = 2; i < a; i++
     *      if a % i == 0
     *      return false
     *  return true
     */
    public static boolean isPrime(int a){
        
        for(int i = 2; i < a; i++) {
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
}
