package package1;
import package2.*;
public class A {
    protected String message = "This is a Protected Message!";
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.varaiable);
        B b = new B();
        System.out.println(b.message1);
    }
}
