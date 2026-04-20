import java.util.*;
class prime{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n,i,flag=0;
        System.out.println("enter number");
        n = sc.nextInt();
        for(i=2;i<=n/2;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(n==1)
        System.out.println("not prime");
        else if(flag==0)
        System.out.println("prime");
        else
        System.out.println("not prime");
    }
}