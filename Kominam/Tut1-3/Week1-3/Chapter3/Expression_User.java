package Chapter3;

import static userlib.TextIO.*;
/**
 * Ask user enter two numbers and
 * operator. then, program caculate
 * until the first number is 0( end program )
 * @author (Kominam)
 */
public class Expression_User
{
   public static void main(String[] args)
        {
            float num1, num2;
            double result;
            char operator;               
                
                do {
                    putln("Please enter the first nummber: ");
                    num1 = getlnFloat();                
                    putln("Please enter the second nummber: ");
                    num2 = getlnFloat();                
                    putln("Please enter an operator: ");
                    operator = getlnChar();
                    
                           switch (operator) {
                               case '+':
                                    result = num1 + num2;
                                    putln("The result is: " +result);
                                    break;
                               case '-':
                                    result = num1 - num2;
                                    putln("The result is: " +result);
                                    break;
                               case '*':
                                    result = num1 * num2;
                                    putln("The result is: " +result);
                                    break;
                               case '/':
                                    result = num1 + num2;
                                    putln("The result is: " +result);
                                    break;
                               default:
                                    putln("The operator is invalid.");
                                    putln("Please try again !");
                                    break;
                           } 
                } while (num1 != 0);
   }
}
