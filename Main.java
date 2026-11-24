import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Presentable robot = new Robot();
        robot.introduce();

        List<String> names = new ArrayList<>();
        names.add("Valdir");
        names.add("Lila");
        names.add("Julia");
        for (String name: names) {
            System.out.println(name);
        }

        List<Person> people = new ArrayList<>();
        people.add(new Person("Valdir", 45));
        people.add(new Person("Lila", 38));
        people.add(new Person("Julia", 19));
        for (Person person: people) {
            System.out.println(person.getName() + " is " + person.getAge() + " years old.");
        }
    }    
}
