public class methods {
    public static void main(String[] args) {
        hello();
        int x = 10;
        int z = 5;
        final double pi = 3.1;
        System.out.println(Math.ceil(pi));
        int result = yoBro(x, z);
        System.out.println(result);
        System.out.println(add(x, z, 10, 50));
        System.out.printf("hello %,f", 10.1112);
    }
static void hello() {
    System.out.println("Hello!");
}
static int yoBro(int x,int z) {
    int y = 20;
    return x+y+z;
}
//method overloading
static int add(int x, int z) {
    int result = x + z;
    return result;
} 
static int add(int x, int y, int z) {
    int result = x + y + z;
    return result;
} 
static int add(int x, int y, int z, int a) {
    int result = x + y + z + a;
    return result;
} 
}
