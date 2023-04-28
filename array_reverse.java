import java.util.Scanner;
class c{
public int m(int a[],int n){
    int b[]=new int[100];
    for( int j=0;j<n;j++){
        b[j]=a[n-j-1];
    }
    for( int j=0;j<n;j++){
        System.out.print(b[j]+" ") ;  
}
return 1;
}
}
public class  array_reverse{
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[100];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        c  l =new c();
        l.m(a,n);
       }
}