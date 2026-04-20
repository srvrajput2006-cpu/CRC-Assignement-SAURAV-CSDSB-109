import java.util.*;
class calc{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        char op;
        System.out.println("enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("enter operator + - * /");
        op = sc.next().charAt(0);
        switch(op){
        case '+': System.out.println(a+b); break;
        case '-': System.out.println(a-b); break;
        case '*': System.out.println(a*b); break;
        case '/': System.out.println(a/b); break;
        default: System.out.println("invalid");
        }
    }
}