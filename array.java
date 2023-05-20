public class array{
    public static void main(String[] args) {
        String city[];
        city = new String[3];
        city[0] = "Jaipur";
        city[1] = "Delhi";
        city[2] = "Mumbai";

        for(String value : city)
        System.out.println(value);
    }
}