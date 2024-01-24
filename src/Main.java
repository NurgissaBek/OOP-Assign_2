import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Student("Ringo","Star",2.5));
        personArrayList.add(new Employee("George","Harrison","CEO",800000.0));
        personArrayList.add(new Student("Paul","McCartney",3.03 ));
        personArrayList.add(new Employee("John","Levi","Trader",500000));
        Collections.sort(personArrayList);
        printData(personArrayList);
        }
        public static void printData(Iterable<Person> people){
        for(Person person:people){
            System.out.println(person.toString());
        }
    }
}