public class Human {
    String name;
    int age;
    double weight;
    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void eat() {
        System.out.println(this.name + " is eating");
    }
}
