package inheritance;

class animaol{
    void eat(){System.out.println("eating");}
}
class cow extends animaol{
    void food(){System.out.println("grass");
    }
}
public class Singleinheritance2 {
    public static void main(String[] args) {
        cow c = new cow();
        c.eat();
        c.food();
    }
}
