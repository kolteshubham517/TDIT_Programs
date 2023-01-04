package inheritance;

class aa{
    void aa(){System.out.println("out");}
}
class bb extends aa{
    void bb(){System.out.println("notout" );}
}
class cc extends aa{
    void cc(){System.out.println("hitwicket");}
}
public class Hierarchicalinheritance5 {
    public static void main(String[] args) {
        cc c = new cc();
        c.cc();
        c.aa();
    }
}
