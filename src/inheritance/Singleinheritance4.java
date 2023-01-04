package inheritance;

class door{
    void open(){System.out.println("open");}
}
class close extends door{
    void close(){System.out.println("close");}
}

public class Singleinheritance4 {
    public static void main(String[] args) {
        close cl = new close();
        cl.open();
        cl.close();
    }
}
