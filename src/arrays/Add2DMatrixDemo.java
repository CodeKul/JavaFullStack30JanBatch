package arrays;

public class Add2DMatrixDemo {
    public static void main(String[] args) {
        int a[][] = {{2,5,6},{4,3,7}};
        int b[][] = {{1,9,8},{2,1,7}};

        int result[][]= new int[2][3];

        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                result[i][j] = a[i][j] + b[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }


    }
}
