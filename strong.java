import java.util.*;
class strong{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n,r,sum=0,temp,i,f;
        System.out.println("enter number");
        n = sc.nextInt();
        temp = n;
        while(n>0){
            r = n%10;
            f = 1;
            for(i=1;i<=r;i++)
                f = f * i;
                sum = sum + f;
                n = n/10;
        }
        if(temp==sum)
        System.out.println("strong");
        else
        System.out.println("not strong");
    }
}