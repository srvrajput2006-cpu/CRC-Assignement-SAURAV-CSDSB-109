import java.util.*;
class rotate{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n,i,k;
System.out.println("enter size");
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
a[i]=sc.nextInt();
System.out.println("enter rotations");
k=sc.nextInt();
for(int r=0;r<k;r++){
int temp=a[0];
for(i=0;i<n-1;i++)
a[i]=a[i+1];
a[n-1]=temp;
}
for(i=0;i<n;i++)
System.out.print(a[i]+" ");
}
}