package inheritance;

class ab{
    void ab(){System.out.println("Ab");}
}
class ac extends ab{
    void ac(){System.out.println("ac");}
}
class ad extends ab{
    void ad(){System.out.println("ad");}
}
class ae extends ac{
    void ae(){System.out.println("ae");}
}
public class Hybridinheritance2 {
    public static void main(String[] args) {
        ae e = new ae();
        e.ae();
        e.ab();
        e.ac();
    }
}
