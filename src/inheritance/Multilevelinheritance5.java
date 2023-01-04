package inheritance;

class m{
    void m(){System.out.println("m");}
}
class n extends m{
    void n(){System.out.println("n");}
}
class o extends n{
    void o(){System.out.println("o");}
}
public class Multilevelinheritance5 {
    public static void main(String[] args) {
        o oo = new o();
        oo.m();
        oo.n();
        oo.o();
    }
}
