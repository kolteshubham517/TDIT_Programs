package inheritance;

class human{
    void walk(){System.out.println("walking");}
}

class man extends human{
    void fast(){System.out.println("fast");}
}
public class Singleinheritance {
    public static void main(String[] args) {
        man m = new man();
        m.walk();
        m.fast();
    }
}
