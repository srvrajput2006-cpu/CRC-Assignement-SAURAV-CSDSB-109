import java.util.*;
class binary{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n,i,key,l=0,h,mid;
System.out.println("enter size");
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
a[i]=sc.nextInt();
System.out.println("enter element");
key=sc.nextInt();
h=n-1;
while(l<=h){
mid=(l+h)/2;
if(a[mid]==key){
System.out.println("found at "+mid);
return;
}
else if(a[mid]<key)
l=mid+1;
else
h=mid-1;
}
System.out.println("not found");
}
}