public class CallByDemo{
    static void changeValue(int x){
        x = 100;
        System.out.println("Inside changeValue: x = " + x);
    }
    static void changeArray(int[] arr){
        arr[0] = 999;
        System.out.println("Inside changeArray: arr[0] = " + arr[0]);
    }
    public static void main(String[] args){
        int num = 10;
        System.out.println("Before changeValue: num = " + num);
        changeValue(num);
        System.out.println("After changeValue: num = " + num);
        System.out.println();
        int[] arr = {1, 2, 3};
        System.out.println("Before changeArray: arr[0] = " + arr[0]);
        changeArray(arr);
        System.out.println("After changeArray: arr[0] = " + arr[0]);
    }
}