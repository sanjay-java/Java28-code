package javaclass.firstweek.secondweek;

import javaclass.firstweek.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Maps {

    public static void main(String[] args) {
        List<Person> personsList  = new ArrayList<>();

        personsList.add(new Person("name1", 18, 204f));  // 1 nanosec
        personsList.add(new Person("name2", 45, 124f));
        personsList.add(new Person("name3", 34, 400f));


        personsList.add(new Person("name4", 32, 204f));
        personsList.add(new Person("name5", 45, 124f));
        personsList.add(new Person("name6", 87, 400f));

        /// get the weight of the person with age = 45

        // get the age of the person with name = name6

        for(Person person: personsList){

            if(person.getName().equals("name6"))
                System.out.println(person.getAge());
        }


        HashMap<String, Person>  map = new HashMap<>();


        map.put("name1", new Person("name1", 18, 204f));  // 1 nanosec
        map.put("name2", new Person("name2", 45, 124f));
        map.put("name3", new Person("name3", 34, 400f));


        map.put("name4", new Person("name4", 32, 204f));
        map.put("name5", new Person("name5", 45, 124f));
        map.put("name6", new Person("name6", 87, 400f));

        map.get("name6");

        // 100K
        // phone  =

        // time complexity ->
        // N elements in collection -> how much time it takes to perform an operation.

        // as N increases over the time

        //  O(N) -> time complexity
        //  O(1) -> fixed

       // O(N^2) -> O of N square
       // O  of N 3
       // O of log N


        // bubble sort  -> O(N^2)


        map.remove("");

        // iterate hashmap

        // get ALL keys

        // iterate over each key and do  map.get(key)

        Set<String> keys = map.keySet();

        for(String key: keys){
            System.out.println(map.get(key));
        }

        // System.out.println(); // .toString()

        // certain methods in any Object
        // Object class -> parent of all the classes in Java
        // toString(), hashCode(), equals() , clone()

        HashSet<String> set = new HashSet<>();

        set.add("name1");
        set.add("name2");
        set.add("name3");
        set.add("name4");

        set.remove("");


        Iterator itr = set.iterator();

        // get all students
        // iterate over students -> getClass() -> // list -> 100 classes
         // 10 -> unique classes

        // arraylist
        // hashmap
    }

    // hashset -> unique values , no duplicates
    // hashmap ->  1

    // set has unique elements, not ordered

    // multi threading -> safe, non-safe
    // readonly collections

}
