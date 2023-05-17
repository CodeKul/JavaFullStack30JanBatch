package arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] n1 = new int[10];
        int []n2;
        int n3[];

        for (int i = 0;i<n1.length;i++){
            n1[i]  = i+1;
//            System.out.println("index " +i);
        }
        System.out.println("----------------");
        for (int i = 0;i<n1.length;i++){
            System.out.println(n1[i]);
        }

        System.out.println(n1[5]);
    }
}
