import java.util.*;
public class StringLength{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int len = 0;
        for (char ch : s.toCharArray())
            len++;
        System.out.println("Length: " + len);
    }
}