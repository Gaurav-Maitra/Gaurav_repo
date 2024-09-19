package Classes_Objects;

class Person {
    int age;
    String name;

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age : " + this.age);
    }
}
public class Program_1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Gaurav";
        p.age = 19;
        p.display();
    }
}
