package streams;

import data.Student;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("jim");
        names.add("henny");

        //display all names using for loop
        for(String name : names){
            System.out.println(names);
        }

        names.remove(0);
        System.out.println(names);

        //display all names using stream
        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
        //stream can only be used once, code below will raise an Exception
        //nameStream.forEach(System.out::println);

    }
}
