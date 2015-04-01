package Chapter3;

import static userlib.TextIO.*;
/**
 * Rolling two dice randomly and 
 * print out how much does it take 
 * to come up snake eyes
 * @author (Kominam)
 */
public class Rolling_Dice
{
    public static void main(String[] args)
        {
            int die1, die2;
            int count = 0;
               /* run it until die1 and die2 are 1 on 
                * each die
               */
                do {
                    die1 = (int) (Math.random()*6)+1;
                    die2 = (int) (Math.random()*6)+1;
               } while ( die1 != 1 && die2 != 1 );
                    count++;                                    
                putln("It takes " +count +" times before the dice come up snake eyes");
        }
}
