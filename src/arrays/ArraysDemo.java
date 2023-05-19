package arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] n1 = new int[10];
        int []n2; //Declaration
        int n3[] = {15,30,45,35,69,75,82,96};
        n2= new int[5]; //instantiation of array
        n2[0] = 5; // initialization
        n2[1] = 10;
        n2[5] = 53;  // ArrayIndexOutOfBoundsException

        for (int i = 0;i<n1.length;i++){
            n1[i]  = i+1;
        }

        for (int n : n3)
            System.out.println(n);

        for (int i = 0;i<n1.length;i++){
            System.out.println(n1[i]);
        }

        System.out.println(n1[5]);
    }
}
