package javaclass.thirdweek;

public interface Maths {

    int square(int x);

    int cube(int x);

    void print(int x);

    default void printString(String x){
        System.out.println(x);
    }

    default void printString2(String x){
        System.out.println(x);
    }

}

// default methods ->  you can add a method implementation inside an interface

// forEach method in Collection interface