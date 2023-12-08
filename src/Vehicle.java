public class Vehicle {
    String name;
    void go() {
        System.out.println("The vehicle is moving!");
    }
    void stop() {
        System.out.println("The vehicle is stopped!");
    }
   Vehicle() {
    this.name = "Vasanth";
   }
   public static void main(String[] args) {
   //polymorphism - object have more than one type
   Bicycle bicycle = new Bicycle();
   Car car = new Car();
   Vehicle racers[] = {bicycle, car};
   for(Vehicle x : racers) {
    x.go();
   }
   }
}
