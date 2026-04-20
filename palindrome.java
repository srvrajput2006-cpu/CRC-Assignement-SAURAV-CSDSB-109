import java.util.*;
class palindrome{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n,r,rev=0,temp;
        System.out.println("enter number");
        n = sc.nextInt();
        temp = n;
        while(n>0){
        r = n%10;
        rev = rev*10 + r;
        n = n/10;
        }
        if(temp==rev)
        System.out.println("palindrome");
        else
        System.out.println("not palindrome");
    }
}