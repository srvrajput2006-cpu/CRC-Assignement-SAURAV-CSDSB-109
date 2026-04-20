import java.util.*;
class insert{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n,i,pos,val;
System.out.println("enter size");
n=sc.nextInt();
int a[]=new int[n+1];
for(i=0;i<n;i++)
a[i]=sc.nextInt();
System.out.println("enter position and value");
pos=sc.nextInt();
val=sc.nextInt();
for(i=n;i>=pos;i--)
a[i]=a[i-1];
a[pos-1]=val;
for(i=0;i<=n;i++)
System.out.print(a[i]+" ");
}
}