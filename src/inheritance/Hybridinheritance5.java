package inheritance;

class as{
    void as(){System.out.println("print");}
}
class ky extends as{
    void ky(){System.out.println("copy");}
}
class krtos extends as{
    void krtos(){System.out.println("write");}
}
class lka extends ky{
    void lka(){System.out.println("read");}
}

public class Hybridinheritance5 {
    public static void main(String[] args) {
        lka lk = new lka();
        lk.lka();
        lk.ky();
        lk.as();

    }
}
