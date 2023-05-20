public class swapping {

    private static void swap(int a, int b){
        int temp  = a;
        a = b;
        b = temp;

        System.out.println("a after swap is : "+a);
        System.out.println("b after swap is : "+b);
    }
    private static void swap(int a, int b, int c){
        int temp  = c;
        c = a;
        a = b;
        b = temp;

        System.out.println("a after swap is : "+a);
        System.out.println("b after swap is : "+b);
        System.out.println("c after swap is : "+c);

    }
    public static void main(String[] args)
    {
        int a = 5 , b=6,c=7;

        swap(a,b);
        a = 5 ; b=6;c=7;
        swap(a,b,c);
    }
}
