import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
 
public class FileinputStream {
 
    public static void main(String[] args){
        FileInputStream fin=null;
        FileOutputStream fout=null;
        try
        {
                fin = new FileInputStream("d:\\test\\Test.txt");
                fout = new FileOutputStream("d:\\test\\Destination.txt");
                int b;
                while ( (b=fin.read()) != -1 )
                {
                    fout.write(b);
                }
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                fin.close();
                fout.flush();
                fout.close();
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
        }
    }
 
}