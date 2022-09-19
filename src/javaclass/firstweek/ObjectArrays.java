package javaclass.firstweek;

import java.util.Arrays;
import java.util.Comparator;

public class ObjectArrays {

    public static void main(String[] args) {

        Person persons[] = new Person[5];

        persons[0] = new Person("abcd", 12, 123f);
        persons[1] = new Person("gdf", 56, 243f);
        persons[2] = new Person("eres", 25, 1893f);
        persons[3] = new Person("Test", 42, 183f);
        persons[4] = new Person("Class", 49, 183f);

        // sorting - when object are stored

        // comparator

        Comparator c = new Comparator<Person>(){

            @Override
            public int compare(Person o1, Person o2) {

                // positive integer means o1 is greater than o2
                // negative integer means o1 isl ess than o2
                // zero means both are equal
                o1.getName();
                o1.getAge();
                int result = 0;
                if(o1.getName().compareTo(o2.getName()) > 0)
                    result = 1;
                if(o1.getName().compareTo(o2.getName()) <0)
                    result = -1;
                return result;
            }
        };



        Arrays.sort(persons, c);

        for(Person p : persons){
            System.out.println(p.getName() + "  " + p.getAge());
        }

        // persons you will get sorted array

        persons[0].compareTo(persons[1]);
    }
}

// interface -> every method is abstract and public
// abstract class -> child class extends and implement the methods
// interface   ->   any class , use key word " implements <interface name>" and then implements.
// you can only extend one class -> diamond problem


// Comparable interface  vs Comparator


