public class Main {
    public static void main(String[] args) {
        /*Friend friend = new Friend("Vasanth");
        Friend friend1 = new Friend("Bro");
        System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();*/
       //inheritance 
        /*Car car = new Car();
        Bicycle bike = new Bicycle();
        System.out.println(bike.pedals);
        System.out.println(car.doors);
        //method overiding
        Dog dog = new Dog();
        Animal animal = new Animal();
        animal.speak();
        dog.speak();*/
        //Dog dog = new Dog("Browny", 5, "@_@");
        //Animal animal = new Animal("vasanth", 21);
        //System.out.println(dog.symbol);
        //animal.speak();
        //System.out.println(dog.bruh());
        //abstract = abstract classes cannot be instantiated,
        //but they can have a subclass.
        //Bikes bike = new Bikes();
        //Brands brand = new Brands();
        //brand.go();
        //encapsulation-attributes of class will be hidden
        //can be accessed only through methods(getters and setters)
        Car1 car1 = new Car1("Thar","4X4",2023);
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        car1.setName("LAmbo");
        System.out.println(car1.getName());
    }
}
