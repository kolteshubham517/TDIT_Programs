package inheritance;

class d{
    void d(){System.out.println("d");}
}
class e extends d{
    void e(){System.out.println("e");}
}
class f extends e{
    void f(){System.out.println("f");}
}
public class Multilevelinheritance2 {
    public static void main(String[] args) {
        f ff = new f();
        ff.f();
        ff.d();
        ff.e();
    }
}
