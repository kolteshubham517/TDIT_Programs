package inheritance;

class A{
    void a(){System.out.println("a");}
}
class B extends A{
    void b(){System.out.println("b");}
}
class C extends B{
    void c(){System.out.println("c");}
}
public class Multilevelinheritance {
    public static void main(String[] args) {
        C cc = new C();
        cc.c();
        cc.b();
        cc.a();
    }
}
