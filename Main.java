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

        Box<String> nameBox = new Box<>();
        nameBox.setValue("Box Valdir");
        System.out.println(nameBox.getValue());

        Box<Integer> ageBox = new Box<>();
        ageBox.setValue(30);
        System.out.println(ageBox.getValue());

        Box<Person> personBox = new Box<>();
        personBox.setValue(new Person("David", 40));
        Person personFromBox = personBox.getValue();
        System.out.println("Person from box: " + personFromBox.getName());
    }    
}
