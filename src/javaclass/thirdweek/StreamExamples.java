package javaclass.thirdweek;

import javaclass.firstweek.Person;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

    public static void main(String[] args) {

        Integer numbers[] = {6,7,8,1,2,3,4,5,9,10,6,7,8,1,2,3,4,5,9,10};


                // stream initialize - datasource - array or collection
        /// it provides methods - filter, sort, map ( converting objects) , aggregate functions
        // lambdas

        // two categories of methods in streams -> intermediate operations and terminal operations
        // intermediate operations - methods that will return a stream  e.g. filter , map, sorted
        // terminal operation - that doesn't return a stream , findFirst, collect, min, max
        //  List<Integer> evenNumbers  = s.filter(p).sorted().collect(Collectors.toList());


        Stream.of(numbers).filter(a -> a%2 == 0).forEach(a -> System.out.println(a));

        for(Integer i: numbers){
            if(i %2 == 0)
                System.out.println(i);
        }

        System.out.println(Arrays.stream(numbers).sorted().findFirst().get());
        // map(), filter(), distinct(), sorted(), limit(), skip()

        // Function ->
        // map -> that takes a function as arguement

        Arrays.stream(numbers).distinct().sorted().limit(2).map( a -> {
            if( a == 1 ) return  "one";
            else if( a ==2) return "two";
            else return "I dont know";
        }).distinct().forEach(a -> System.out.println(a));

        // arraylist, hashset and hashmap

        List<Person> personsList = new ArrayList<>();
        personsList.add(new Person("name1", 18, 204f));  // 1 nanosec
        personsList.add(new Person("name2", 45, 124f));
        personsList.add(new Person("name3", 34, 400f));


        personsList.add(new Person("name4", 32, 204f));
        personsList.add(new Person("name5", 45, 124f));
        personsList.add(new Person("name6", 87, 400f));

        // Stream.of(personsList)

        List<Person> filteredList = personsList.stream().filter(p -> p.getAge() > 50).collect(Collectors.toList());

        personsList.stream().filter( p -> p.getAge()<20).map(p -> p.getName()).forEach(p -> System.out.println(p));

        personsList.stream().distinct().count();

        personsList.stream().mapToInt(p -> p.getAge()).sum();

        // parallelStream

        personsList.parallelStream().filter( p -> p.getAge()<20).map(p -> p.getName()).forEach(p -> System.out.println(p));


        // given a string, remove duplicate characters in the string.

    }
}

