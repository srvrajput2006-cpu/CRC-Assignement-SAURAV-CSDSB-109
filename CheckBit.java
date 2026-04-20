import java.util.Scanner;

public class CheckBit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Enter bit position (0-indexed): ");
        int n = sc.nextInt();

        if ((num & (1 << n)) != 0)
            System.out.println("Bit " + n + " is SET");
        else
            System.out.println("Bit " + n + " is NOT set");
    }
}