import java.util.*;
public class MatrixAdd{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and cols: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] sum = new int[r][c];
        System.out.println("Enter matrix A:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();
        System.out.println("Enter matrix B:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                sum[i][j] = a[i][j] + b[i][j];
        System.out.println("Sum:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(sum[i][j] + " ");
            System.out.println();
        }
    }
}
