package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        //student name and there activities in a map
        Predicate<Student> studentPredicate = student -> student.getGradeLevel()>=3;
        Predicate<Student> studentgpaPredicate = student -> student.getGpa()>=3.9;

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().parallelStream()
                .filter(studentPredicate)
                .filter(studentgpaPredicate)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        //System.out.println(studentMap);

        /*
        * debugging stream using peek
        * */
        Map<String, List<String>> studentMapDebug = StudentDataBase.getAllStudents().parallelStream()
                //.peek((student -> System.out.println(student)))
                .filter(studentPredicate)
                .peek((student -> System.out.println("after first filter "+student)))
                .filter(studentgpaPredicate)
                .peek((student -> System.out.println("after second filter "+student)))
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        //System.out.println(studentMapDebug);

    }
}
