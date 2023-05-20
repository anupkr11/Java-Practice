public class hello{
    public static void main(String[] args){
        String s1="hello.java";
        int s2=s1.indexOf(".");
        System.out.println(s2);
        System.out.println(s1.substring(s2+1));

    }
}