package javaclass.thirdweek;

@FunctionalInterface
public interface MathFunctional {

    // An interface with only one abstract method
    // SAM Interface - Single Abstract Method interface

    int square(int x);
}


// Java has defined standard / default functional interfaces .
// functional interfaces created by Java , which are most frequently used.
// you need a method that takes an argument and returns argument.

//  Function -> a functional interface that takes an argument and returns argument.
//  Consumer ->  a functional interface that takes an argument and return nothing.
// Producer -> a functional interface that takes NO argument but returns something.
// Predicate -> a functional interface that takes an argument and returns a boolean value
// BiFunction -> (x,y) -> x+y;