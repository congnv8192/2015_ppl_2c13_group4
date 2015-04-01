package Chapter2;

import static userlib.TextIO.*;

/**
 * Exchange eggs of user into gross and dozen
 * @author (Kominam)
 */
public class Eggs_Count
{
    public static void main(String[] args)
        {
            int total, gross, dozen;
            int left, eggleft;

                putln("How many eggs you have: ");
                total = getlnInt();
                /* gross = 144 eggs
                   dozen = 12 eggs
                */
                gross = total/144;
                left = total % 144;
                dozen = left/12;
                eggleft = left % 12;
                
                putln("You have " +gross +" gross " +dozen +" dozen " +eggleft +" eggs left");                
        }
}
