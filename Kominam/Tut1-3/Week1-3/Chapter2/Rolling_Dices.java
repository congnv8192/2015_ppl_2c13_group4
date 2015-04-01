package Chapter2;

import static userlib.TextIO.*;
/**
 * Rolling two dice randomly and compute sum
 * of number showing on each die
 * @author (Kominam)
 */
public class Rolling_Dices
{
   public static void main (String[] args)
        {
            int dice1, dice2, total;
                
                // rolling two dice randomly
                dice1 = (int) (Math.random()*6)+1;
                dice2 = (int) (Math.random()*6)+1;
                // total of number appeared on each die
                total = (int) dice1 + dice2;
            
                putln("The first die comes up: " +dice1);
                putln("The second die comes up: " +dice2);
                putln("Your total roll is: " +total);
        }
}
