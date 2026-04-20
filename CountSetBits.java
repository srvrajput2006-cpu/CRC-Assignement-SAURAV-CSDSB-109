import java.util.Scanner;

public class CountSetBits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        while (temp != 0) {
            if ((temp & 1) == 1)
                count++;
            temp >>= 1;
        }

        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Set bits: " + count);
    }
}