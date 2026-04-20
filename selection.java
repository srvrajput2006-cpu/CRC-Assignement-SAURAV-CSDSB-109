import java.util.*;
class selection{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n,i,j,min,temp;
System.out.println("enter size");
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
a[i]=sc.nextInt();
for(i=0;i<n-1;i++){
min=i;
for(j=i+1;j<n;j++){
if(a[j]<a[min])
min=j;
}
temp=a[i];
a[i]=a[min];
a[min]=temp;
}
for(i=0;i<n;i++)
System.out.print(a[i]+" ");
}
}