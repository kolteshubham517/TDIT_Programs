package inheritance;

class qw{
    void qw(){System.out.println("qw");}
}
class qe extends qw{
    void qe(){System.out.println("qe");}
}
class qr extends qw{
    void qr(){System.out.println("qr");}
}
class qt extends qe{
    void qt(){System.out.println("laptop");}
}
public class Hybridinheritance3 {
    public static void main(String[] args) {
        qt qq = new qt();
        qq.qt();
        qq.qe();
        qq.qw();
    }
}
