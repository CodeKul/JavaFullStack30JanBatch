package common.operators;

public class OperatorImpl
{
    public static void main(String[] args) {
        //Unary Operator
        int a = 50;
        System.out.println("a++:"+ a++); //50
        System.out.println("++a"+ ++a);  //52
        int b= 10;
        System.out.println("b--"+ b--); //10
        System.out.println("--b"+ --b); //8

        int c = 12;
        System.out.println("~c "+~c);// (-12)-1 = -13

        boolean flag = false;
        System.out.println(!flag);

        //Arithmetic Operator
        System.out.println(5+6); //11
        System.out.println(11-5); //6
        System.out.println(5*6); //30
        System.out.println(10/2); //5
        System.out.println(10%3); //1

        //Shift Operators
        int x = 10 ,y=20;
        System.out.println("x<<2 "+(x<<2)); //10<<2 // 10*2^2 = 10*2*2=40
        System.out.println("x<<3 "+(x<<3)); //10<<3 // 10*2^3  10*2*2*2=80

        System.out.println("y>>2 "+(y>>2)); //20>>2 // 20/2^2 =20/4=5
        System.out.println("y>>3 "+(y>>3)); // 20>>3 // 20/2^3 = 20/8 = 2

        int p = 10,q=5,r=20;
        System.out.println(p>q && q>r);

        System.out.println(p<q & q<r);

        System.out.println(p>q || q>r);

        System.out.println(p>q| q>r);

        //Ternary Operators (? :)

        int max = p > q ? p : q;
        System.out.println(max);

        //Assignment Operators
        System.out.println(p += 5);
    }
}
