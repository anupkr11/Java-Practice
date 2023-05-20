public class PersonDemo {

    public static void main(String[] args) {
   Person policeman;
   policeman = new Person(); // a default constructor to create an object of Person type
   policeman.print();
   Person dancer = new Person();
   dancer.print();
   dancer.setName("Hirthik");
   Person teacher = new Person("Chandra", 53);
   teacher.print();
   Person nephew = new Person("Johnny");
   nephew.print();
   System.out.println("The name of my nephew is "+ nephew.getName().toUpperCase());
   if(isPolicemanADancer(policeman,dancer))
   System.out.println(policeman.getName() + " is a good dancer too");
   else
   System.out.println(dancer.getName() + " is not a policeman");
   }
   
    static boolean isPolicemanADancer(Person p, Person d)
   {
   if (p==d)
   return true;
   else
   return false;
   }
   }
   
   class Person
   {
   String name; // declaration of name property or field
   int age; // declaraton of age property
   
   void print() // method implementation or method definition
   {
   System.out.println("Name: "+name); // System.out.println("Name:" + this.name);
   System.out.println("Age: "+age);
   }
   Person()
   {
   name="Undefined";
   age = -1;
   }
   Person(String n, int a)
   {
   name = n;
   age = a;
   }
   Person(String name)
   {
   this.name = name;
   age = 0;
   }
   void setName(String newName) // setter method for name field
   {
   name = newName;
   }
   String getName()
   {
   return name;
   }
   }