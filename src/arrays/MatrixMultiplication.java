package arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int m1[][] = {{1, 2}, {3, 4}};
        int m2[][] = {{5, 6}, {7, 8}};
        int result[][] = new int[3][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = 0;

                for (int k = 0; k < 2; k++) {
                        result[i][j] = m1[i][k] * m2[k][j];
                }
                System.out.print(result[i][j]+" ");
            }
            System.out.println();

        }
    }
}
