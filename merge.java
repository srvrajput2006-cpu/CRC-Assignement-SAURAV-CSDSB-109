import java.util.*;
class merge{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n1,n2,i;
System.out.println("enter size1 and size2");
n1=sc.nextInt();
n2=sc.nextInt();
int a[]=new int[n1];
int b[]=new int[n2];
for(i=0;i<n1;i++)
a[i]=sc.nextInt();
for(i=0;i<n2;i++)
b[i]=sc.nextInt();
int c[]=new int[n1+n2];
for(i=0;i<n1;i++)
c[i]=a[i];
for(i=0;i<n2;i++)
c[n1+i]=b[i];
for(i=0;i<n1+n2;i++)
System.out.print(c[i]+" ");
}
}