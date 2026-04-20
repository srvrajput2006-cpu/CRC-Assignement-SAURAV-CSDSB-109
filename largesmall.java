import java.util.*;
class largeSmall{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n,i;
System.out.println("enter size");
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
a[i]=sc.nextInt();
int max=a[0],min=a[0];
for(i=1;i<n;i++){
if(a[i]>max) max=a[i];
if(a[i]<min) min=a[i];
}
System.out.println("max = "+max);
System.out.println("min = "+min);
}
}