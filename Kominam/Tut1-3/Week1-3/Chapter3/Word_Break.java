package Chapter3;

import static userlib.TextIO.*;
/**
 * List word in string that is entered by user
 * @author (Kominam)
 */
public class Word_Break
{
    public static void main(String[] args) 
        {
            String text;
            int i;
            char ch;
            boolean didCR;
            
                putln("Please enter string: ");
                text = getlnString();
                
                putln();
                didCR = true;
                
                for ( i = 0; i < text.length(); i++){
                    ch = text.charAt(i);
                    if ( Character.isLetter(ch) ){
                        put(ch);
                        didCR = false;
                    } else if ( didCR == false ){
                        putln();
                        didCR = true;
                    }
                }
                putln();
        }
}
