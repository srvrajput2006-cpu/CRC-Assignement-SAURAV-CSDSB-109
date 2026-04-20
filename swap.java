import java.util.*;
class swap{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=2;
        int b=3;//swaping using three variable
        int temp;
        System.out.println("value a and b:"+a+" "+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("swaped value a and b:"+a+" "+b);
    }
}