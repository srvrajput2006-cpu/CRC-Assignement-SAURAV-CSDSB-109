import java.util.*;
public class EqualMatrices{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and cols: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        System.out.println("Enter matrix A:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();
        System.out.println("Enter matrix B:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();
        boolean equal = true;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] != b[i][j]) {
                    equal = false;
                    break;
                }
            }
        }
        if (equal)
            System.out.println("Matrices are equal");
        else
            System.out.println("Matrices are not equal");
    }
}