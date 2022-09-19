package javaclass.firstweek;

public class ArrayClass {

    public static void main(String[] args) {

        // []

        int a[] = new int[10];

        a[0] = 123;
        a[1] = 124;
        a[2] = 234;
        a[3] = 345;
        a[4] = 456;

        //
        //
        a[9] = 342;

        String days[] = new String[7];
        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesday";


        String daysOfWeek[] = new String[]{"Sunday", "Monday", "Tuesday"};

        String daysOfWeek2[] = {"Sunday", "Monday", "Tuesday"};

  // initializing an array / creating Array
        // inserting or adding data to an Array
  // read the data

        String s2 = days[0];
        String s3 = days[2];

        String names[] = new String[1000];

        String name = names[899];

        for(int i =0; i<=names.length-1; i++){
            System.out.println(names[i]);
        }

        int numbers[] = new int[100];

        for(int i =0; i<=numbers.length-1; i++){
            numbers[i] = i;
        }

        for(int i =0; i<=numbers.length-1; i++){
            if(numbers[i]%2 == 1)
                System.out.println(numbers[i]);
        }

        // iterate

        // 10 divided by 2 ->  5 is divident and 0 remainder  - > / , %
    }

}

// ArrayIndexOutOfBounds
// StringIndexOutOfBounds