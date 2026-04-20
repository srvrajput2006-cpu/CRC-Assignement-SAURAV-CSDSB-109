import java.util.*;
class temperature{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float F;
        float C;
        System.out.println("ENTER THE CELSIUS:");
        float T=sc.nextFloat();
        C=T;
        F=((9.0f/5)*C+32);
        System.out.println("CELSIUS TO FARHENITE CONVERTED VALUE IS : "+F);
        float Farhenite=T;
        float Celsius=(5.0f/9)*(Farhenite-32);
        System.out.println("FARHENITE TO CELSIUS CONVERTED VALUE IS : "+Celsius);
    }
}