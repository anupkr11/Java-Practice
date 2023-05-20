import javax.print.event.PrintEvent;

public class Exception {
    public static void main(String[] args) {
        int[] arr = new int[4];
        try{
            System.out.println("Before exception is generated");
            arr[6] = 10;
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Araay index out of bound");
        }
    }    
}
