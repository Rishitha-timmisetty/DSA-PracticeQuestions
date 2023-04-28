//works nly if both min and max r +ve elements
import java.util.Scanner;
class p{
    int maxi(int a[],int n){
        int max=0,k=0;
        for(int i=0;i<n;i++){
            if(a[i]>a[max]){
                max=i;
            }
        }
        System.out.println(a[max]);
        
        for(int i=0;i<n;i++){
            if(a[i]==a[max]){
                a[i]=0;
            }
    }a[max]=-2147483648;
    for(int i=0;i<n;i++){
        if(a[i]>a[max]){
            max=i;
        }
    }
    System.out.println(a[max]);
        
        return 1;
    }
}
public class array_2ndmax {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[100];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    p o=new p();
    o.maxi(a,n);
}
}
