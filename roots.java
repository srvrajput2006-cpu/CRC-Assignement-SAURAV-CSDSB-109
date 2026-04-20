import java.util.*;
class roots{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double a,b,c,d,r1,r2;
        System.out.println("enter a b c");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = b*b-4*a*c;
        if(d>0){
        r1 = (-b + Math.sqrt(d))/(2*a);
        r2 = (-b - Math.sqrt(d))/(2*a);
        System.out.println("roots = " + r1 + " " + r2);
        }
        else if(d==0){
        r1 = -b/(2*a);
        System.out.println("roots = " + r1);
        }
        else{
        System.out.println("imaginary roots");
        }
    }
}