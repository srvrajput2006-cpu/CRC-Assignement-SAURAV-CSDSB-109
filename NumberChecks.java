import java.util.*;
public class NumberChecks{
    static boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
    static boolean isArmstrong(int n){
        int temp = n, digits = 0, sum = 0;
        while (temp != 0){ digits++; temp /= 10; }
        temp = n;
        while (temp != 0){
            int d = temp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) power *= d;
            sum += power;
            temp /= 10;
        }
        return sum == n;
    }
    static boolean isPerfect(int n) {
        if (n < 2) return false;
        int sum = 1;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) sum += i;
        return sum == n;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(n + " is prime: " + isPrime(n));
        System.out.println(n + " is Armstrong: " + isArmstrong(n));
        System.out.println(n + " is perfect: " + isPerfect(n));
    }
}