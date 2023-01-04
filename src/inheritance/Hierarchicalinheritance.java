package inheritance;

class xx{
    void x(){System.out.println("x");}
}
class yy extends xx{
    void y(){System.out.println("y");}
}
class zz extends xx{
    void z(){System.out.println("z");}
}
class ww extends yy{
    void w(){System.out.println("ww");}
}
public class Hierarchicalinheritance {
    public static void main(String[] args) {
        z zz = new z();
        zz.z();
        zz.x();
    }
}
