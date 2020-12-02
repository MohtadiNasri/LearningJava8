package streams;

import data.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args){

        List<Person> listStudent = new ArrayList<>();
        listStudent.add(new Person("Mohtadi",29));
        listStudent.add(new Person("Nasri",28));
        Stream<Person> streamStudent = listStudent.stream();


        //Consumer
        streamStudent.forEach(p-> System.out.println(p));
        //Predicate
        streamStudent.filter(p -> p.getAge()>20);

    }
}
