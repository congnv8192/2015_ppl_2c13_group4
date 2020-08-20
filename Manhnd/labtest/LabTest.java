 
/**
 * @overview do some task with a text file
 * @author manhnd
 */
public class LabTest {
/**
 * Read text File, remove reduntdant space, normalize word, print updated file.
 * 
 * @effect 
 *  {@link #TextIO.readFile() }: read text file
 *  while (!eof),get StringContent from text file i.e StringContent+= TextIO.getln()
 *  {@link #StringContent.replaceAll("\\+s", " ")}: remove redundant space
 *  {@link #TextIO.getWord}: get word from StringContennt
 *  uppercase the first letter and lowercase other letter of the word 
 *  print the updated file data2.txt
 */
/***ManhMn**/
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
}
public static int countLine(String[] path) {
    /**
     * count line in new txt file
     * @effect open and get string from data2.txt
     *          split array into elements separated by line break
     *          count number element.
     */
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
public static int countDifferentword(String updateContent) {
    
}
}
