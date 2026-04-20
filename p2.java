import java.util.*;
class p2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);int n,i,j;
        System.out.println("enter n");
        n=sc.nextInt();
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++)
            System.out.print("*");
            System.out.println();
        }
    }
}