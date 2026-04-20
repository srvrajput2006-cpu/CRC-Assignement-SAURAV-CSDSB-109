import java.util.*;
class si{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float SI;
        float CI;
        float P;
        System.out.println("Enter the principle amount or borrowed amount or invested amount : ");
        float R;
        P=sc.nextFloat();
        System.out.println("Enter the rate per annum : ");
        R=sc.nextFloat();
        float T;
        System.out.println("Enter the time period : ");
        T=sc.nextFloat();
        SI=(P*R*T)/100.0f;
        System.out.println("The simple interest is : "+SI);
        CI = (float)(P * Math.pow((1 + R / 100), T) - P);
        System.out.println("The compound interest is : "+CI);
    }
}


