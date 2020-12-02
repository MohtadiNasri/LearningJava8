package streams;

import data.Person;

import java.util.ArrayList;
import java.util.Arrays;
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

        System.out.println("-------------------FILTER---------------------------");

        //Working with predicate
        Stream<String> streamOfNumber = Stream.of("one","two","three","four","five");
        //first Predicate
        Predicate<String> filterUsingPredicate = s->s.length()>3;

        streamOfNumber.filter(filterUsingPredicate)
                .forEach(n-> System.out.println(n));

        System.out.println("---------------------MAP---------------------");

        //Map
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> list2 = Arrays.asList(2,4,6);
        List<Integer> list3 = Arrays.asList(3,5,7);

        List<List<Integer>> finalList = Arrays.asList(list1,list2,list3);

        finalList.stream()
                .peek(l->System.out.println(l))
                .map(l->l.size())
                .forEach(System.out::println);

    }
}
