import java.util.*;
public class CountChars{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                spaces++;
            } else if (c >= '0' && c <= '9') {
                digits++;
            } else if (Character.isLetter(c)) {
                char lower = Character.toLowerCase(c);
                if (lower=='a'||lower=='e'||lower=='i'||lower=='o'||lower=='u')
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
}