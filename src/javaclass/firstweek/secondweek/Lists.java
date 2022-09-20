package javaclass.firstweek.secondweek;

import javaclass.firstweek.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Lists {

    public static void main(String[] args) {

        // ArrayList  list = new ArrayList();

        // heterogeneous collection -> use same type

        // generics -> is way to enforce same type of object in collection

        // list ?

        // ArrayList<Person> personsList = new ArrayList<>(); // right way create Arraylist

        LinkedList<Person> personsList = new LinkedList<>();

        // add
        // remove
        // addAll
        // removeAll

        // iterate
         // get
        // IndexOf


        personsList.add(new Person("name1", 18, 204f));
        personsList.add(new Person("name2", 45, 124f));
        personsList.add(new Person("name3", 34, 400f));
        personsList.add(new Person("name4", 32, 204f));
        personsList.add(new Person("name5", 45, 124f));
        personsList.add(new Person("name6", 87, 400f));

        // retrieving -> iterator to go over all the elements
        // get -> gets by index

        Person p3 = personsList.get(2);

        Iterator<Person> personIterator = personsList.iterator();

        while(personIterator.hasNext()) {
            Person p = personIterator.next();
            System.out.println(p.getName());
        }

        // for loop

        for(int i =0; i < personsList.size(); i++){
            Person p = personsList.get(i);
            System.out.println(p.getName());
        }

        for(Person p: personsList){
            System.out.println(p.getName());
        }

        // forEach

        personsList.forEach( p -> System.out.println(p.getName())); // lambdas / functional interfaces



        // remove
        personsList.remove(0);
            System.out.println("after removing");
        personsList.forEach( p -> System.out.println(p.getName()));

            // Array -> add or remove -> needs to readjust indexes
        // major dropback
        // more elements -> needs to recreate internal array and copy over all the elements

        // array list are -> get by index
        // if your use case -> add elements and retrieve
    }

    // lot of adds and removals
    // LinkedList



}
