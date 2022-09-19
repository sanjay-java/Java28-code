package javaclass.firstweek;

public final class Loops {
    public static void main(String[] args) {
        //System.out.println(1);
        //System.out.println(2);

        // while
        // do while
        // for

        // while(condition) { ...... }
        int i = 1; // initializing
        while ( i <= 100) {  // condition
            System.out.println(i);
             i++; // increment  i = i +1;
        }

        System.out.println(" i value after the loop " + i);

        int j = 1; // initialization

        do {
            System.out.println(j);
            j++; // increment
        }while ( j < 1); // condition

        // for( initialization; condition; increment ){ .... }

        for( int k =1; k < 100; k++ )
            System.out.println(k);


        for ( int k =0; ; k++) {

            if( k == 50)
                break;
        }



        for( ; true; )
            break;





    }
}
// i = 1
// i=2
