package Week45design;

import static userlib.TextIO.*;
/**
 * user can choose to solve the following problem: 
 *  ->count negative number 
 *  ->find the minimum number
 *  ->whether array is ascending sorted
 *  ->find the length of the array of chars
 *  ->find median of an array of real
 *  ->compare two arrays of real to determine  if a is subset of b,
 *      b is subset of a, a union b, or a = b
 * @author (Kominam) 
 */
public class Arrays
{
     /**
     * @overview: the main procedures
     * @effects:
     *   {@link #switch()}: print list problem as follow
     *      switch (option)
     *          case '1': {@link #countNegative()}
     *          case '2': {@link #minimum()}
     *          case '3': {@link #isAscSorted()}
     *          case '4': {@link #length()}
     *          case '5': {@link #median()}
     *          case '6': {@link #compare()}
     *      default()
     *          {@link #putln()}: print error option
     */
    public static void main (String[] args){
    
    }
    
    /**
     * @overview: print an array
     * @requirement: array is not null /\ a.length > 0
     * @effects:
     *  for (int i = 0; i < a.length; i++)
     *      {@link #putln()}: enter elements of array
     */
    public static void print_arrays(int [] a) {
        for (int i = 0; i< a.length; i++){
            putln(a[i]+ " ");
        }
    }
    
    /**
     * @overview: count the negative number in array
     * @requirements: an array is not null /\ a.length > 0
     * @effect: 
     *      declare an integer variable count = 0
     *      for i: (int i = 0; i < a.length; i++)
     *      if a[i] less than 0
     *      {@link count++}: increase 'count'
     *      return count
     */
    public static int countNegative(int [] a) {
        int count = 0;
        
            for (int i = 0; i < a.length; i++){             
                if(a[i] < 0){
                    count++;
                }
            }
            
        return count;
    }
    
    /**
     * @overview: find the minimum element in array a
     * @requirements: an array a is not null /\ a.length > 0
     * @effects: 
     *      declare integer variable min = a[0]
     *      for i: (int i = 0; i < a.length; i++)
     *      {@link if()}: 
     *      if a[i] < min 
     *      min is assigned to a[i]
     *      return min
     *  {@link #putln()}: print out the minimum of this array
     */
    public static int minimum(int [] a) {
            int min = a[0];
            
            for (int i = 0; i < a.length; i++){
                if (a[i] < min) {
                    min = a[i];       
                }
            }           
            
        putln("The minimum of this array is: "+min);
        return min;
    }  
    
    /**
     * @overview: whether an array is sorted in ascending order
     * @requirement: array is not null /\ a.length > 0
     * @effects:
     *      for (int i = 0; i < a.length; i++)
     *          // bubble sort 
     *          if a[i] > a[i+1] 
     *          // swap a[i] and a[i+1]
     *          int temp = a[i]
     *          a[i] = a[i+1]
     *          a[i+1] = temp
     *      for (int i = 0; i < a.length; i++)
     *      #put a[i]
     * @modification: print out an sorted array  
     */
    public static void isAscSorted(int [] a){
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[i+1]) {
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        
        for (int i = 0; i < a.length; i++){
            putf(a[i]+" ");
        }
    }
    
    /**
     * @overview: determine array length of CHARs
     *             until null chatacter
     * @requirement:
     * @effects:
     *      declare int count = 0
     *      for (int i = 0; i < a.length; i++)
     *          while (a.charAt(i) != Null)
     *          count++
     *      return count
     */
    public static int length(String [] a){
        
    }
    
    /**
     * @oveview: 
     * @requirement: 
     * @effects:
     */
    public static void median(int [] a){
       
    }
    
    /**
     * @requirement:
     * @effects:
     */
    public static void compare(int [] a){
    
    }
    
    /**
     * @overview: count the frequencies of each element in array of reals
     * @requirement: array is not null /\ a.length > 0
     * @effects:
     *      Float [] freq
     *      freq[] = 0
     *      for (int i = 0; i < a.length; i++)
     *          for (int j = 0; j < a.length; j++)
     *          if (a[i] == a[j]){
     *              freq[i]++
     */
    public static void freq(float [] a){
    
    }
}