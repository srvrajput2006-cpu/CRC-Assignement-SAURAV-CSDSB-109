import java.util.*;
class evenodd{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("The given number is the even : "+n);
        }else{
            System.out.println("The given number is odd : "+n);
        }
    }
}