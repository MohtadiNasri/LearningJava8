import java.util.stream.IntStream;

public class ImperativeVSDeclarativeProgramming {

    public static void main(String[] args) {

        //first Example - Sum of 100 numbers from 0 to 100
        /*
        * Imperative Style of programming
        * */

        int sum = 0;
        for(int i=0;i<=100;i++){
            sum+=i;
        }
        System.out.println("Sum using the imperative approach! "+ sum);
        /*
         * Declarative Style of programming
         * */
        int resultDeclative = IntStream.rangeClosed(0,100).sum();
        System.out.println("Sum using the declarative approach! "+ resultDeclative);


        //second Example - Removing duplicates from a list of integers
        /*
         * Imperative Style of programming
         * */
         
        /*
         * Declarative Style of programming
         * */

    }
}
