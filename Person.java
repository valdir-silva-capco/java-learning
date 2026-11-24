public class Person implements Presentable{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age.");
            return;
        }
        this.age = age;
    }
    @Override
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}
