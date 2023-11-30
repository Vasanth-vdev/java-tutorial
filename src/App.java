import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        /*int x = 10;
        int y = 20;
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println(x);
        System.out.println(y);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Enter your age : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your favourite food : ");
        String food = scanner.nextLine();
        System.out.println("Your name is : " + name);
        System.out.println("Your age is  : " + age);
        System.out.println("Your favourite food is :" + food);
        double friends = 10;
        friends /= 3;
        System.out.println(friends);
        String name = JOptionPane.showInputDialog
        ("Enter your name");
        JOptionPane.showMessageDialog
        (null, "Hello" + name);
        int age = Integer.parseInt(JOptionPane.showInputDialog
        ("Enter your age"));
        JOptionPane.showMessageDialog
        (null, "Age : " + age);
        double height = Double.parseDouble
        (JOptionPane.showInputDialog("Enter height : "));
        JOptionPane.showMessageDialog(null, "Your height is : " + height);
        double x = 10;
        double y = 10.01;
        System.out.println(Math.round(y));
        System.out.println(Math.ceil(y));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 'A'");
        int a = scanner.nextInt();
        System.out.println("Enter side 'B'");
        int b = scanner.nextInt();
        double z = Math.sqrt(a*a + b*b);
        System.out.println("The hypo is  : " + z);
        scanner.close();*/
        //Random random = new Random();
        //int x = random.nextInt(6) + 1;
        //double x = random.nextDouble();
        //boolean x = random.nextBoolean();
        //System.out.println(x);
        /*int age = 9;
        if(age >= 18) {
            System.out.println("Adult!");
        }
        else if(age < 18 && age >=10) {
            System.out.println("Teenage!");
        }
        else {
            System.out.println("Children");
        }
        String day = "Monday";
        switch(day) {
            case "Sunday" : System.out.println("Its sunday");
            break;
            case "Monday" : System.out.println("Its Monday");
            break;
            case "Tuesday" : System.out.println("Its Tuesday");
            break;
            case "Wednesday" : System.out.println("Its Wednesday");
            break;
            case "Thursday" : System.out.println("Its Thursday");
            break;
            case "Friday" : System.out.println("Its Friday");
            break;
            case "Saturday" : System.out.println("Its Saturday");
            break;
            default : System.out.println("Wrong input");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter q or Q to quit!");
            String response = scanner.next();
            if (response.equals("q") || response.equals("Q")) {
                System.out.println("You quit");
            }
            else {
                System.out.println("Still Playing");
            }
        Scanner scanner = new Scanner(System.in);
        String name = "";
        do {
            System.out.println("Enter your Name : ");
            name = scanner.next();
        }while(name.isBlank());
        System.out.println("Hello " + name);
        for(int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        Scanner scanner = new Scanner(System.in);
        int rows,columns;
        String symbol;
        System.out.println("Enter the no of rows : ");
        rows = scanner.nextInt();
        System.out.println("Enter the no of columns : ");
        columns = scanner.nextInt();
        System.out.println("Enter the symbol : ");
        symbol = scanner.next();
        for(int i = 1; i <= rows; i++) {
            System.out.println();
            for(int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }
        String[] cars = {"TATA","SUPRA","G-WAGON"};
        cars[0] = "MAHINDRA";
        System.out.println(cars[0]);
        String[] bikes = new String[3];
        bikes[0] = "Hunter";
        bikes[1] = "Pulsar";
        bikes[2] = "RX100";
        for(int i = 0; i < bikes.length; i++) {
            System.out.print(bikes[i]);
        }
        int[][] numbers = {{00,01,02},
                           {10,11,12},
                           {20,21,22}
                          };
        int[][] num = new int[3][3];
        num[0][0] = 0;
        num[0][1] = 1;
        num[0][2] = 2;
        num[1][0] = 10;
        num[1][1] = 11;
        num[1][2] = 12;
        num[2][0] = 20;
        num[2][1] = 21;
        num[2][2] = 22;
        for(int i = 0; i < numbers.length; i++) {
            System.out.println();
            for(int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
        }
        for(int i = 0; i < num.length; i++) {
            System.out.println();
            for(int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
        }
        //strings methods
        //String name = "Bro  ";
        //boolean result = name.equalsIgnoreCase("bRo");
        //int res = name.length();
        //char results = name.charAt(0);
        //int pos = name.indexOf("o");
        //String result = name.toUpperCase();
        //String result = name.toLowerCase();
        //String result = name.trim();
        //String result = name.replace("o", "uh");
        //System.out.println(result);
        //Wrapper class
        //Boolean a = true;
        //Integer i = 1;
        //Double d = 12.33;
        //String s = "b";
        //ArrayList
        ArrayList<String> food = new ArrayList<String>();
        food.add("Biryani");
        food.add("Rice");
        food.add("Noodles");
        food.set(1, "curd");
        food.remove(1);
        food.clear();
        for(int i = 0; i < food.size() ; i++) {
            System.out.println(food.get(i));
        }*/
        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Moong Dal");
        bakeryList.add("Garlic bread");
        bakeryList.add("Biryani");
        bakeryList.set(1, "Rice");
        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("Lemon");
        drinksList.add("PineApple");
        drinksList.add("Apple");
        //2D ArrayList List
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        groceryList.add(bakeryList);
        groceryList.add(drinksList);
        System.out.println(groceryList.get(1).get(2));
        //forEach
        String animals[] = {"Dog", "Cat", "Horse"};
        for(String i : drinksList) {
            System.out.println(i);
        }
        ArrayList<String> name = new ArrayList<>();
        //toString
        
       }
    }
