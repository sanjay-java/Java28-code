package javaclass.firstweek;

public class Conditional {

    public static void main(String[] args) {
        // class , object
        // oops - encapsulation, abstraction, polymorphism, inheritance - overloading and overriding
        // Git - basics

        // conditionals , loops

        //   == , >=  <= < , <,  && , ||

        // if statment

        //   if( <condition> ) { ..... }

        int a = 10;

        int b = 20;

        int c = 30;

        if( a == b && ( a > b && b >c )) {
            System.out.println("numbers are equal");
        } else {
            System.out.println("numbers are NOT equal");
        }

        if( a > b) {
            System.out.println(" a is greater than b");
        } else if ( a < b) {
            System.out.println(" a is less than b");
        }
        else if ( c < b) {
            System.out.println(" c is less than b");
        }
        else if ( c > b) {
            System.out.println(" c is greater than b");
        }else {
            System.out.println(" a is equals to b");
        }
        String s = "";


        // ternary operator

        s = (a > b) ?  "a is greater than b" : " a is less than or equals to b";



        // else if

        // BODMAS -> brackets,

        // && - > true && true  ---> true
        // && - > false && true  ---> false
        // && - > true && false  ---> false
        // && - > false && false  ---> false

        // || - > true || true  ---> true
        // ||- > false || true  ---> true
        // || - > true || false  ---> true
        // ||- > false || false  ---> false


    }
}
