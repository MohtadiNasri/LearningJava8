package functionalinterfaces;

import functionalinterfaces.data.Student;
import functionalinterfaces.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> consumer2 = (student)-> System.out.println(student);
    static Consumer<Student> consumer3 = (student)-> System.out.print(student.getName());
    static Consumer<Student> consumer4 = (student)-> System.out.println(student.getActivities());

    // Return all list of student
    public static void printStudents(){
        System.out.println("printStudents : ");

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumer2);
    }

    // Return the name and activities of student
    public static void printNameandActivities(){
        System.out.println("printNameandActivities : ");

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(consumer3.andThen(consumer4)); // consumer chaining
    }

    // Return the name and activities of student using condition
    public static void printNameandActivitiesUsingConditions(){
        System.out.println("printNameandActivities using condition: ");

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(student.getGradeLevel()>=3 && student.getGpa()>=3.9){
                consumer3.andThen(consumer4).andThen(consumer2).accept(student);
            }
        })); // consumer chaining
    }

    public static void main(String[] args) {

        Consumer<String> consumer1 =   (s)-> System.out.println(s.toUpperCase());
        consumer1.accept("java eight");

        /*
        * real use case scenario
        * */
        printStudents();
        printNameandActivities();
        printNameandActivitiesUsingConditions();


    }
}
