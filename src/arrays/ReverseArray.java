package arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {65,12,55,33,88,45};
        System.out.println("Given Array is ");
        for (int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("Reverse of an array");

        for (int i=arr.length-1;i>0;i--){
            System.out.print(" "+arr[i]);         }
    }
}
