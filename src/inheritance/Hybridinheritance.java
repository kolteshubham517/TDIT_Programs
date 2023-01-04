package inheritance;

class w{
    void w(){System.out.println("w");}
}
class x extends w{
    void x(){System.out.println("x");}
}
class y extends w{
    void y(){System.out.println("y");}
}
class z extends x{
    void z(){
        System.out.println("z");
    }
}
public class Hybridinheritance {
    public static void main(String[] args) {
        z zz = new z();
        zz.w();
        zz.x();
        zz.z();
    }
}
