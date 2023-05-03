package statickeyword;

public class StaticBlockDemo {
    static  int n = 5;
    static {
        System.out.println("in static block"+n);
        //System.exit(0); //not possible
    }
    public static void main(String[] args) {
        System.out.println("Welcome");
    }
}
