package inheritance;

class j{
    void j(){System.out.println("j");}
}
class k extends j{
    void k(){System.out.println("k");}
}
class l extends k{
    void l(){System.out.println("l");}
}
public class Multilevelinheritance4 {
    public static void main(String[] args) {
        l ll = new l();
        ll.l();
        ll.j();
        ll.k();
    }
}
