public class Main {
    public static void main(String[] args) {
        Presentable person = new Person("Valdir Silva", 45);
        Presentable robot = new Robot();

        person.introduce();
        robot.introduce();
    }    
}
