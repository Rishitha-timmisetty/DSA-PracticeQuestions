// doesn't work if elements are repeated
import java.util.Scanner;
class p{
    int maxi1(int a[],int n){
        int max=0,k=0;
        for(int i=0;i<n;i++){
            if(a[i]>a[max]){
                max=i;
            }
        }
        System.out.println(a[max]);
        for(int j=0;j<n;j++){
            if(a[j]>=a[k] && a[j]!=a[max]){
                k=j;
            }
        }
        System.out.println(a[k]);
        return k;
        
    }
}
public class array_2ndmax_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[100];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    p o=new p();
    o.maxi1(a,n);
}
}
