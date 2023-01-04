package inheritance;

class a{
    void hp(){System.out.println("hp");}
}
class b extends a{
    void dell(){System.out.println("dell");}
}
public class Singleinheritance5 {
    public static void main(String[] args) {
        b bb = new b();
        bb.dell();
        bb.hp();
    }
}
