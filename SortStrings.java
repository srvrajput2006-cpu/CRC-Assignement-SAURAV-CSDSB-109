import java.util.*;
public class SortStrings{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many strings? ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("String " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted:");
        for (String str : arr)
            System.out.println(str);
    }
}