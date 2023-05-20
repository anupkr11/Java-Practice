public class generics {

    public static void main(String[] args) {
        Test<Integer> c = new Test<>(10);
        System.out.println(c.getA());
        Test<String> s = new Test<>("Hello");
        System.out.println(s.getA());
        Test<Double> d;
        d = new Test<>(.25);
    }

}

class Test<T> {
    T a;

    Test(T a) {
        this.a = a;
    }

    T getA() {
        return a;
    }

    void setA(T a) {
        this.a = a;
    }
}
