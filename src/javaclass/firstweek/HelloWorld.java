package javaclass.firstweek;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("hello world");

        System.out.println("hello world - third day");

        Person p = new Person(12, 123f);

        String s = "Sanjay";

        System.out.println(s.toUpperCase());

        System.out.println(s.toLowerCase());

        System.out.println(s.length());
        System.out.println(s.charAt(2)); // indexes starts with zero
        // last character
        System.out.println(s.charAt(s.length()-1));

        System.out.println(s.indexOf("S")); // case sensitive

        // s

        // find index of character N , irrespective of the case

        System.out.println(s.toUpperCase().indexOf("N"));
        //Sanjay
        System.out.println(s.indexOf("a"));
        System.out.println(s.lastIndexOf("a"));

        String nothing = ""; // empty string

        if(nothing.isEmpty())
            System.out.println("it is empty");

        // equals
        // equalsIgnoreCase

        System.out.println(s.equals("SANJAY")); // case sensitive

        System.out.println(s.equalsIgnoreCase("SANJAY"));

        String sentence = "this is a sample sentence for learning split operation";
        sentence.split(" ");



        // String

        // Date
        // Collections - Arraylist, HAshSet, HashMap




    }
}
