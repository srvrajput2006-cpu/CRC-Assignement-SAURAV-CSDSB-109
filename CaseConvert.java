import java.util.*;
public class CaseConvert{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String lower = "", upper = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z')
                lower += (char)(c + 32);
            else
                lower += c;

            if (c >= 'a' && c <= 'z')
                upper += (char)(c - 32);
            else
                upper += c;
        }
        System.out.println("Lowercase: " + lower);
        System.out.println("Uppercase: " + upper);
    }
}