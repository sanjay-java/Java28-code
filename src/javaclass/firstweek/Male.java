package javaclass.firstweek;

public class Male extends  Person {
    Male(int age, float weight){
        super(age, weight);
    }

    @Override
    public int getAge(){
        return  1;
    }

}

// public
// private
// default - access limited to same package
// protected - default plus child classes in same or other packages