import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
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
        //System.out.println("Sum using the imperative approach! "+ sum);
        /*
         * Declarative Style of programming
         * */
        int resultDeclative = IntStream
                .rangeClosed(0,100)
                .sum();
        //System.out.println("Sum using the declarative approach! "+ resultDeclative);


        //second Example - Removing duplicates from a list of integers
        List<Integer> duplicateList = Arrays.asList(1,2,2,3,4,5,6,7,7,7,7,8,8,8,9,9,9,9);
        /*
         * Imperative Style of programming
         * */
         List<Integer> uniqueList = new ArrayList<>();
         for(Integer integer : duplicateList){
             if(!uniqueList.contains(integer)){
                 uniqueList.add(integer);
             }
         }
         System.out.println("First unique list : "+uniqueList);
        /*
         * Declarative Style of programming
         * */
        List<Integer> uniquelist = duplicateList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Second unique list : "+uniquelist);


    }
}
