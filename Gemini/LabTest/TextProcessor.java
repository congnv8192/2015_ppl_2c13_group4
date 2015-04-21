 
/**
 * @overview: This program perform some change in text file
 * @author: gemnini
 */
public class TextProcessor {
/**
 * Read text File, remove reduntdant space, normalize word, print updated file.
 * 
 * @effect 
 *  {@link #TextIO.readFile() }: read text file
 *  get StringContent from text file i.e StringContent+= TextIO.getln()
 *  {@link #StringContent.replaceAll("\\+s", " ")}: remove redundant space
 *  uppercase the first letter and lowercase other letter of the word 
 *  print the updated file data2.txt
 */

public static void task2(String[] path)
{
    try {
        TextIO.readFile("data.txt");
    }
    catch ( IllegalArgumentException e) {
        TextIO.putln("Cannot open your file:");
        TextIO.putln("Please try again:");
    }
     String line="";
     String content="";
     while (! TextIO.eof()) {
         line+= TextIO.getln();
         content= "\n" + line;
    }
    content=content.replaceAll("\\+s", " ");
    String word[]= content.split(" ");
    for (int i=0; i < word.length; i++)
    {
        char firstletter;
        String otherletter="";
        firstletter= word[i].charAt(0);
        firstletter= Character.toUpperCase(firstletter);
        otherletter= word[i].substring(1,word[i].length());
        word[i]= firstletter + otherletter;
    }
    String updateContent= "";
    for (int i=0; i < word.length; i++)
    {
        updateContent+= word[i]+" ";
    }
    TextIO.writeFile("data2.txt") ;
    TextIO.putln("\n" + updateContent);
    TextIO.writeStandardOutput();
}
/**
 * Count the line of the updated file
 * 
 * @effect
 *      open and get string from data2.txt
 *      split array into elements separated by line break i.e : '\n'
 *      count the number element of above array
 */    
public static int countLine(String[] path){
     try {
         TextIO.readFile("data2.txt");
    }
    catch ( IllegalArgumentException e) {
        TextIO.putln("Cannot open your file:");
        TextIO.putln("Please try again:");
    }
    String linecnt="";
    String updateContent="";
     while (! TextIO.eof()) {
         linecnt+= TextIO.getln();
         updateContent= "\n" + linecnt;
    }
        String[] line= updateContent.split("\r\n|\r|\n");
        return line.length;
}

/**Count the total number of word in updated file 
 *  
 * @effect: 
 * get content from file
 * convert it into array
 * count the total element= total word
 */
public static int countTotalWord( String[] path) {
    int totalword=0;
     try {
         TextIO.readFile("data2.txt");
    }
    catch ( IllegalArgumentException e) {
        TextIO.putln("Cannot open your file:");
        TextIO.putln("Please try again:");
    }
    String line="";
    String updateContent="";
     while (! TextIO.eof()) {
         line+= TextIO.getln();
         updateContent= "\n" + line;
    }
    String [] word= updateContent.split(" ");
    for (String w: word )
            totalword++;
    return totalword;
}
public static int countDistinctwords(String[] path) {

}
}