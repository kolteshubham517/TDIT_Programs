package inheritance;

class pets{
    void pets(){System.out.println("pets");}
}
class dog extends pets{
    void dog(){System.out.println("dog");}
}
class cat extends pets{
    void cat(){System.out.println("cat");}
}
public class Hierarchicalinheritance4 {
    public static void main(String[] args) {
        cat ca = new cat();
        ca.cat();
        ca.pets();
    }
}
