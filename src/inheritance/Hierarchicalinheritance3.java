package inheritance;

class u{
    void r(){System.out.println("r");}
}
class s extends u{
    void s(){System.out.println("s");}
}
class t extends u{
    void t(){System.out.println("t");}
}
public class Hierarchicalinheritance3 {
    public static void main(String[] args) {
        t tt = new t();
        tt.t();
        tt.r();
    }
}
