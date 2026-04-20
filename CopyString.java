import java.util.Scanner;
public class CopyString{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String copy = "";
        for (int i = 0; i < s.length(); i++)
            copy += s.charAt(i);
        System.out.println("Copied: " + copy);
    }
}