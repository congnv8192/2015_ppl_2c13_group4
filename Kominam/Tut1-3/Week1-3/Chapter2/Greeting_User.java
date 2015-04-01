package Chapter2;

import static userlib.TextIO.*;
/**
 * Print greet user by their name after 
 * change to upper case
 * @author (Kominam)
 */
public class Greeting_User
{
    public static void main(String[] args)
        {
            String name;
                putln("Please enter your name: ");
                name = getlnString();
                // change to upper case
                name = name.toUpperCase();
                putln("Hello, " +name +", nice to meet you!");
        }
}
