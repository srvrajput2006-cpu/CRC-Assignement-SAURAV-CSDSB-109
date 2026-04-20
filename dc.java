import java.util.*;
class dc{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number remaining of days: ");
        int td= sc.nextInt();
        int years= td/365;
        int rd= td%365;
        int weeks=rd/7;
        int days=rd%7;
        System.out.println("Years: " +years);
        System.out.println("Weeks: " +weeks);
        System.out.println("Days: " +days);
    }
}