import java.util.*;
class p6{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n,i,j,num=1;
System.out.println("enter n");
n=sc.nextInt();
for(i=1;i<=n;i++){
for(j=1;j<=i;j++){
System.out.print(num+" ");
num++;
}
System.out.println();
}
}
}