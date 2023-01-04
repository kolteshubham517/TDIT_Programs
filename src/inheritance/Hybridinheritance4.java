package inheritance;

class zx{
    void zx(){System.out.println("zx");}
}
class zc extends zx{
    void zc(){System.out.println("zc");}
}
class zv extends zx{
    void zv(){System.out.println("zv");}
}
class zb extends zc{
    void show(){System.out.println("zv");}
}
public class Hybridinheritance4 {
    public static void main(String[] args) {
        zb zbb = new zb();
        zbb.show();
        zbb.zc();
        zbb.zx();
    }
}
