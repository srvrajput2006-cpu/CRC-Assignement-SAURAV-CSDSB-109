import java.util.*;
class fibb{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n,a=0,b=1,c,i;
        System.out.println("enter n");
        n = sc.nextInt();
        System.out.print(a + " " + b + " ");
        for(i=3;i<=n;i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}