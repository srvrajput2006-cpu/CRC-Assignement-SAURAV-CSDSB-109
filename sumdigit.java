import java.util.*;
class sumdigit{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n,r,sum=0;
        System.out.println("enter number");
        n = sc.nextInt();
        while(n>0){
            r = n%10;
            sum = sum + r;
            n = n/10;
        }
        System.out.println("sum = " + sum);
    }
}