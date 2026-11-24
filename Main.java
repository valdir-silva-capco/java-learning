public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Valdir Silva", 45);
        Person person2 = new Person("Maria Santos");

        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
    }    
}
