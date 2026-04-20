import java.util.*;
class sumavg{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n,i,sum=0;
System.out.println("enter size");
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
a[i]=sc.nextInt();
for(i=0;i<n;i++)
sum+=a[i];
double avg=(double)sum/n;
System.out.println("sum = "+sum);
System.out.println("avg = "+avg);
}
}