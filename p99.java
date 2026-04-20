import java.util.*;
public class p99{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int n = s.length();
        boolean isPalin = true;
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                isPalin = false;
                break;
            }
        }
        if (isPalin)
        System.out.println(s + " is a palindrome");
        else
        System.out.println(s + " is not a palindrome");
    }
}