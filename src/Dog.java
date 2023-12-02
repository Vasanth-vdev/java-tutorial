public class Dog extends Animal {
    String symbol;
    @Override
    void speak() {
        System.out.println("Dog be barking!");
    }
    Dog(String name, int age, String symbol) {
        //super refers to parent class
        super(name, age);
        this.symbol = symbol;
    }
    public String bruh() {
        return super.toString() + this.symbol;
    }
}
