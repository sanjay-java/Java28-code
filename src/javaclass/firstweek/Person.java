package javaclass.firstweek;

public class Person {

   private int age; // 0
   private float weight; // 0.0f

   Person(){}
   Person(int age, float weight){
      this.age = age;
      this.weight = weight;
   }

   void run(){

   }

// method arguments - pass by value and pass by reference
   void run(int speed){

   }

   void run(float miles){

   }

   boolean isTeen(){
      return false; // TODO implement later
   }

   public int getAge(){
      return  this.age;
   }

   public void setAge(int age){
      this.age = age;
   }

}

abstract class Run {
   Person p = new Person(40, 200f);
   int age = p.getAge();

   Male m = new Male(30, 300f);

   void somemethod() {
      p.setAge(50);
      //System.outm.getAge();
   }

   abstract void doSomethingElse();

}


abstract  class walk extends Run {


}



// object oriented
// Abstraction  -- abstract

// inheritance -- extends , super class and child class

// polymorphism -  method overloading - same method name and return type but different arguments


// encapsulation - all instance variables are private and getter and setter - get data and set data

// access modifiers -  private, public, default, protected

// private -



// keywords - predefined words by language itself
// data types - int, long, short, char, float, double, boolean
// 0, , 0.0, false
//String - class
//"Sanjay" - object
// class , int , new
// new


// method signature -       void <name>(){ -- statements
// }