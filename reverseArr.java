import java.util.*;
class reverseArr{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n,i,temp;
System.out.println("enter size");
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
a[i]=sc.nextInt();
for(i=0;i<n/2;i++){
temp=a[i];
a[i]=a[n-1-i];
a[n-1-i]=temp;
}
for(i=0;i<n;i++)
System.out.print(a[i]+" ");
}
}