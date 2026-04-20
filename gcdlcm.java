import java.util.*;
class gcdlcm{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a,b,i,gcd=1,lcm;
        System.out.println("enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        for(i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0)
                gcd = i;
        }
        lcm = (a*b)/gcd;
        System.out.println("gcd = " + gcd);
        System.out.println("lcm = " + lcm);
    }
}