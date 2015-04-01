package Chapter3;

import static userlib.TextIO.*;
/**
 * compute and print the total sales
 * from all the cities together
 * @author (Kominam) 
 */
public class Total_Sales
{
    public static void main(String[] args) {
        try {
            readFile("sales.dat");
        }
        catch (IllegalArgumentException e){
            putln("Can't open this file");
        }
        
        double salesTotal;
        int missingCount = 0;
        
        salesTotal = 0;
        
        while ( ! eof() ){
            char ch;
            String data;
            double sales;
            
            do {
                ch = getChar();
            } while (ch != ':');
            
            data = getln();
            
            try{
                sales = Double.parseDouble(data);
                salesTotal += sales;
            }
            catch (NumberFormatException e){
                missingCount++;
            }
        }
        
        putln("Total sales of all cities is: " +salesTotal);
        if (missingCount == 0) {
            putln("Data was received from all cities.");
        } else if (missingCount == 1) {
            putln("Missing data from one city.");
        } else {
            putln("Data was missing from %d cities." +missingCount);
        }
    }
}
