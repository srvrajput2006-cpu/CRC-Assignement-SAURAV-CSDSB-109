import java.util.*;
class area{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        float area;
        float circumference;
        System.out.println("Enter the radius of the circle : ");
        float r=sc.nextFloat();
        area=3.14f*r*r;
        System.out.println(" Area of the circle is : "+area);
        circumference=2.0f*3.14f*r;
        System.out.println("circumference of the circle is : "+circumference);
    }
}