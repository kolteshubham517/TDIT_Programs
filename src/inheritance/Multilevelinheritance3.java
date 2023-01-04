package inheritance;

class g{
    void g(){System.out.println("g");}
}
class h extends g{
    void h(){System.out.println("h");}
}
class i extends h{
    void i(){System.out.println("i");}
}
public class Multilevelinheritance3 {
    public static void main(String[] args) {
        i ii = new i();
        ii.i();
        ii.h();
        ii.g();
    }
}
