import java.util.*;
public class CompareStrings{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        boolean equal = true;
        if (s1.length() != s2.length()) {
            equal = false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    equal = false;
                    break;
                }
            }
        }
        if (equal)
        System.out.println("Strings are equal");
        else
        System.out.println("Strings are not equal");
    }
}