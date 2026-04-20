import java.util.*;
class eoo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if ((n & 1) == 0){
        System.out.println("The given number is Even");
        }else{
        System.out.println("The given number is Odd");
        }
    }
}