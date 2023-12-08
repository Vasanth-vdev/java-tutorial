import java.util.Scanner;
public class Index {
    public static void main(String[] args) {
        //interface - a template that can be applied to a class.
        //similar to inheritance, but specifies what a class must do.
        //Classess can apply more than one interface, inheritance is limited to one 1 super class.
        Hawk hawk = new Hawk();
        hawk.hunt();
        Predator grass = new Grass();
        grass.hunt();
        //polymorphism - many forms 
        //The ability of an object to identify as more than one type
        //Dynamic polymorphism
        Scanner scanner = new Scanner(System.in);
        Fish fish;
        System.out.println("Enter 1 for molly or 2 for Flowehorn");
        int input = scanner.nextInt();
        if(input == 1) {
            fish = new Molly();
            fish.speak();
        }
        else if (input == 2) {
            fish = new Flowerhorn();
            fish.speak();
        }
        else {
            System.out.println("Invalid input!");
        }
    }
}
