import java.util.*;
class linear{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n,i,key;
System.out.println("enter size");
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
a[i]=sc.nextInt();
System.out.println("enter element");
key=sc.nextInt();
for(i=0;i<n;i++){
if(a[i]==key){
System.out.println("found at "+i);
return;
}
}
System.out.println("not found");
}
}