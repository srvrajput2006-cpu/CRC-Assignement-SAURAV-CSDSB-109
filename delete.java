import java.util.*;
class delete{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n,i,pos;
System.out.println("enter size");
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
a[i]=sc.nextInt();
System.out.println("enter position");
pos=sc.nextInt();
for(i=pos-1;i<n-1;i++)
a[i]=a[i+1];
for(i=0;i<n-1;i++)
System.out.print(a[i]+" ");
}
}