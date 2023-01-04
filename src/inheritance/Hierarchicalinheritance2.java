package inheritance;

class p{
    void p(){System.out.println("p");}
}
class q extends p{
    void q(){System.out.println("q");}
}
class r extends p{
    void r(){System.out.println("r");}
}
public class Hierarchicalinheritance2 {
    public static void main(String[] args) {
        r rr = new r();
        rr.p();
        rr.r();
    }
}
