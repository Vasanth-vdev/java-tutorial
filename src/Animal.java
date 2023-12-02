public class Animal {
    String name;
    int age;
    void speak() {
        System.out.println("Dark is barking!");
    }
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return this.name + " \n " + "  " + this.age;
    }
}
