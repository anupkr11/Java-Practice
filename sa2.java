public class sa2 {
    public static void main(String[] args) {
        int count = 0, j = 1, i = 1, n = 1;
        while (n < 10) {
            count = 0;
            for (j = 1; j <= n; j++) {
                count++;
                if (count == 2) {
                    System.out.println(i);
                    n++;
                }
                i++;
            }

        }
    }
}