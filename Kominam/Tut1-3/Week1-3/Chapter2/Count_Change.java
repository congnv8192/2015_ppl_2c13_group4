package Chapter2;

import static userlib.TextIO.*;

/**
 * Exchange from quarter, dime
 * nickel, pennies to dollar
 * @author (Kominam)
 */
public class Count_Change
{
    public static void main(String[] args)
        {
            double quarter, dime;
            double nickel, pennie, dollar;
            
                putln("How many quarter you have: ");
                quarter = getlnDouble();
                putln("How many dimes you have: ");
                dime = getlnDouble();
                putln("How many nickels you have: ");
                nickel = getlnDouble();
                putln("How many pennies you have: ");
                pennie = getlnDouble();
                /*quarter = 25 cents
                dime = 10 cents
                nickel = 5 cents
                pennies = 1 cent
                */
                dollar = pennie*0.01 + nickel*0.05 + dime*0.1 + quarter*0.25;
                
                putln("You have " +dollar +" dollar");
                
        }
}
