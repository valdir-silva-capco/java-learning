import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Presentable robot = new Robot();
        robot.introduce();

        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.stream()
            .filter(person -> person.getAge() > 30)
            .forEach(person -> 
                System.out.println("Name: " + person.getName() + ", Age: " + person.getAge())
            );

        List<String> names = people.stream()
                                    .map(person -> person.getName())
                                    .collect(Collectors.toList());
        System.out.println("Names of all people: " + names);
    }    
}
