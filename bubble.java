import java.util.*;
class bubble{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n,i,j,temp;
System.out.println("enter size");
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
a[i]=sc.nextInt();
for(i=0;i<n-1;i++){
for(j=0;j<n-1-i;j++){
if(a[j]>a[j+1]){
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
for(i=0;i<n;i++)
System.out.print(a[i]+" ");
}
}