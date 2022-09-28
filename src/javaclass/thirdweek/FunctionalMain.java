package javaclass.thirdweek;

import java.util.function.Consumer;

public class FunctionalMain {

    public static void main(String[] args) {

        Functional f = new Functional();
        System.out.println(f.square(5));

        // anonymous inner classes ( 1.5)

        MathFunctional mf = new MathFunctional() {
            @Override
            public int square(int x) {
                return x*x;
            }
        };

        System.out.println(mf.square(10));

        MathFunctional mfLambda = (x) -> x*x;  // infer

        MathFunctional mathFunctional2 = (x) -> {
            if(x < 0){
                return 0;
            }
            return x*x;
        };

        Consumer c = (x) -> System.out.println(x);


        // object creation is removed
        // Override key is removed
        // method name is removed
        // access modifier and return type is removed
        // return keyword is optional
        // parenthesis is optional

        print(c);

    }

    static void print(Consumer c){
        c.accept("this is lambda example");
    }
}

//  introduce functional programming  vs object-oriented programming
//  reduce memory usage and redundant code

//  Lambdas and Lambda expressions

        // () -> {}
        // (x) -> x*x

// an interface with no methods - marker interface. cloneable , serializable, RandomAccess