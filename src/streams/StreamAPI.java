package streams;

import data.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args){

        List<Person> listStudent = new ArrayList<>();
        listStudent.add(new Person("Mohtadi",29));
        listStudent.add(new Person("Nasri",28));
        Stream<Person> streamStudent = listStudent.stream();


        //Consumer
        //streamStudent.forEach(p-> System.out.println(p));
        //Predicate : the line below will rais en exception as we are not allowed to use stream twice
        //streamStudent.filter(p -> p.getAge()>20);

        //Correct Way
        streamStudent.filter(p -> p.getAge()>20).forEach(p-> System.out.println(p));

        System.out.println("-----------------------------------------------------");

        //Working with predicate
        Stream<String> streamOfNumber = Stream.of("one","two","three","four","five");
        //first Predicate
        Predicate<String> filterUsingPredicate = s->s.length()>3;

        streamOfNumber.filter(filterUsingPredicate)
                .forEach(n-> System.out.println(n));


    }
}
