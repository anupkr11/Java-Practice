public class classobj {
    public static void main(String[] args){
        Person policeman;
        policeman = new Person();
        policeman.name = "Rahul";
        policeman.age = 50;
        System.out.println("Name is:"+ policeman.name);
        System.out.println("Age is:"+ policeman.age);
        Person subInspector;
        subInspector = policeman;
        System.out.println("Name is:"+ subInspector.name);
        System.out.println("Age is:"+ subInspector.age);

        policeman.print();
    }
}

class Person{
    String name;
    int age;

    void print(){
        System.out.println("Name is:"+name);
        System.out.println("Age is:"+age);
    }
}