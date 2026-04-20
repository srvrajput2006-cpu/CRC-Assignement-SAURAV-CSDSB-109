import java.util.*;
class checkchar{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("enter character");
        ch = sc.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        System.out.println("alphabet");
        else if(ch>='0' && ch<='9')
        System.out.println("digit");
        else
        System.out.println("special character");
    }
}