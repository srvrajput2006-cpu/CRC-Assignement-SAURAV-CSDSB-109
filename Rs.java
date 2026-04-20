import java.util.*;
class Rs{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if ((n & 1) == 0){
        System.out.println("The given number is the Even");
        }else{
        System.out.println("The given number is the Odd");
        }
    }
}