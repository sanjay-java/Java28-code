package javaclass.firstweek;

public class Test {
    Person p = new Person(40, 200f);
    int age = p.getAge();

    static Male m = new Male(30, 300f);

    public static void main(String[] args) {
        //System.out.println(m.getAge());

        // p -->

        // inheritance ->

        Person p1 = new Male(35, 129.0f);

        Person p2 = new Female(24, 124f);



        // male.getAge();
        // male.setAge(23);

        m.getAge();
        m.setAge(56);

        // runtime polymorphism

        System.out.println(p1.getAge());

    }
}
