import java.util.Scanner;

public class ToggleBit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Enter bit position to toggle (0-indexed): ");
        int n = sc.nextInt();

        int result = num ^ (1 << n);

        System.out.println("Original: " + Integer.toBinaryString(num) + " (" + num + ")");
        System.out.println("Toggled:  " + Integer.toBinaryString(result) + " (" + result + ")");
    }
}