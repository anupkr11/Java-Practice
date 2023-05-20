public class pattern {
    public static void main(String[] args)
    {
        pattern1(5);
        pattern2(5);
        pattern3(4);
    }

    private static void pattern1(int n){
        for(int i=1;i<=n;i++)
        System.out.print(i + " ");
        System.out.println("\n");
    }

    private static void pattern2(int n){
        for(int i=1;i<=n;i++)
        System.out.println((int)Math.pow(i,2));
        System.out.println("\n");
    }

    private static void pattern3(int n){
        for(int i=n;i>0;i--)
        {
            for(int j=0;j<i;j++)
            System.out.print("*");
            System.out.println();
        }
        
    }
}
