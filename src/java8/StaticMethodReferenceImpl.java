package java8;
interface Calculate{
    int getMinValue(int n1,int n2);
}
public class StaticMethodReferenceImpl {
    public static void main(String[] args) {
        Calculate calculate = Math::min;
        int result = calculate.getMinValue(10,20);
        System.out.println(result);
    }
}
