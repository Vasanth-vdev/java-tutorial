public class oop {
    public static void main(String[] args) {
        //Car myCar = new Car();
        //Car myCar1 = new Car();
        //System.out.println(myCar.price);
        //myCar.brake();
        //myCar1.drive();
        //System.out.println(myCar1.year);
        //Human human = new Human("Vasanth", 21, 62);
        //Human human1 = new Human("gskills", 22, 50);
        //System.out.println(human.name);
        //System.out.println(human1.name);
        //human1.eat();
        //Car mycar = new Car();
        //System.out.println(mycar.toString());
        /*Food food1 = new Food("Biryani");
        Food food2 = new Food("Chicken");
        Food food3 = new Food("Mutton");
        Food refrigerator[] = {food1, food2, food3};
        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);*/
        Car car = new Car("Vasanth");
        Car car1 = new Car("Tesla");
        Garage garage = new Garage();
        garage.park(car1);
        garage.park(car);
    }
}
