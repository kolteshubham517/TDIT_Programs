package inheritance;

class shubham{
    void learn(){System.out.println("learning");}
}
class java extends shubham{
    void java(){System.out.println("java");}
}
public class Singleinheritance3 {
    public static void main(String[] args) {
        java j = new java();
        j.learn();
        j.java();
    }
}
