package Chapter2;

import static userlib.TextIO.*;

/**
 * Read File and compute average three exam
 * of user 
 * @author (Kominam)
 */
public class Student_Grade
{
    public static void main(String[] args)
        {
            String name;
            int first, second, third;
            double average;
                
                try {
                    readFile("testdata.txt");                    
                }
                catch (IllegalArgumentException e){
                    putln("File not found. Try again !!!");
                }
                     
                name = getlnString();
                first = getlnInt();
                second = getInt();
                third = getlnInt();
                
                average = (first + second + third)/3;
                               
                putln("Student's name: " +name);
                putln("Student's average grade: " +average);                
        }
}
