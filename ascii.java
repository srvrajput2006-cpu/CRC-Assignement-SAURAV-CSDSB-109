import java.util.*;
class ascii{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char ch;
        int a;
        System.out.println("enter character");
        ch = sc.next().charAt(0);
        a = (int) ch;
        System.out.println("ascii value = " + a);
    }
}