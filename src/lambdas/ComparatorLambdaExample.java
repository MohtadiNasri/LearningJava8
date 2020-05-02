package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        /*
         * prior Java 8
         * */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 0 if o1==o2 | 1 if o1>o2 | -1 if o1<o2
                return o1.compareTo(o2);
            }
        };
        System.out.println("The result of the comparator is : "+ comparator.compare(3,2));

        /*
        * jave 8 Lambda
        * */
        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("The result of the comparator Lambda is : "+ comparator.compare(3,2));

    }
}
