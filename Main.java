public class Main {
    public static void main(String[] args) {
        Person person = new Person("Valdir Silva", 45);

        System.out.println(person.getName());
        System.out.println(person.getAge());

        person.setAge(46);
        System.out.println(person.getAge());
    }    
}
