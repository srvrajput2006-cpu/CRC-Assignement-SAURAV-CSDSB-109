import java.util.*;
class p5{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n,i,j,c;
        System.out.println("enter n");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            c=1;
            for(j=0;j<=i;j++){
                System.out.print(c+" ");
                c=c*(i-j)/(j+1);
}
System.out.println();
}
}
}