import java.io.FileReader;
import java.io.FileWriter;

public class fileReader {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try{
            fr = new FileReader("d:\\test\\Test.txt");
            fw = new FileWriter("d:\\test\\Destination.txt");

            
        }
    }
}
