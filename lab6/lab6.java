import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;


public class lab6 {
        
        public static void main(String[] args) {
                try{
                    Scanner fin = new Scanner(new File("C:\\Users\\anup1\\OneDrive\\Desktop\\lab6\\plain.txt"));
                    PrintStream fout = new PrintStream(new File("crypt.txt"));
                    ChangeChar(fin, fout);
                }
                catch(FileNotFoundException e){
                    System.out.println(e);
                }    
        }
        
        public static void ChangeChar(Scanner fin, PrintStream fout) {
                while (fin.hasNextLine()) {
                        String stringInput = fin.nextLine();
                        Scanner characters = new Scanner(stringInput);
                        
                        while (characters.hasNext()) {
                                String replaceString = new String(characters.next());
                                replaceString = replaceString.replace("t", "7");
                                replaceString = replaceString.replace("a", "4");
                                replaceString = replaceString.replace("e", "6");
                                replaceString = replaceString.replace("o", "0");
                                replaceString = replaceString.replace("l", "1");
                                
                                if (replaceString.endsWith("s")) {
                                        replaceString = replaceString.substring(0, 
                                                        replaceString.length() - 1) + "5";
                                }
                                
                                fout.print("(" + replaceString + ") ");
                        }
                        
                        fout.println();
                        characters.close();
                }       
        }
}